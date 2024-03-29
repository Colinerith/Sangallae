package com.example.sangallae.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sangallae.R
import com.example.sangallae.retrofit.models.CourseItem
import com.example.sangallae.retrofit.models.Mountain
import com.example.sangallae.ui.MainActivity
import com.example.sangallae.ui.detail.CourseDetailActivity
import com.example.sangallae.utils.Constants
import com.example.sangallae.utils.RESPONSE_STATUS
import com.example.sangallae.utils.Usage
import com.google.android.material.appbar.MaterialToolbar
import com.jeongdaeri.unsplash_app_tutorial.retrofit.RetrofitManager


class HotMountainList : Fragment() {
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var mToolbar: Toolbar
    private var courseList = ArrayList<Mountain>()
    private lateinit var hotMountainListAdapter: MountainViewAdapter
    //private lateinit var callback: OnBackPressedCallback
    private var itemFinished = false
    private var page = 0;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.hot_mountain_list, container, false)
        //homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        //val textView: TextView = root.findViewById(R.id.text_home)
        //homeViewModel.text.observe(viewLifecycleOwner, Observer { textView.text = it })

        mToolbar = root.findViewById(R.id.app_toolbar)
        (activity as AppCompatActivity).setSupportActionBar(mToolbar)
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        mToolbar.setNavigationOnClickListener {
            (activity as MainActivity?)!!.onBackPressed()
        }

        setHasOptionsMenu(true)

        hotMountainApiCall(page)

        // 추천 화면 갱신
        //refreshHome()
        val recyclerView = root.findViewById<RecyclerView>(R.id.hot_mountain_recycler_view)
        this.hotMountainListAdapter = MountainViewAdapter()
        this.hotMountainListAdapter.submitList(courseList)

        //root activity view context this.context 중에 root만 되네
        recyclerView.layoutManager =
            LinearLayoutManager(
                context, //activity?
                RecyclerView.VERTICAL,
                false
            )
        this.hotMountainListAdapter = MountainViewAdapter()
        recyclerView.adapter = this.hotMountainListAdapter

        this.hotMountainListAdapter.submitList(courseList)
        hotMountainListAdapter.notifyItemRangeChanged((page - 1) * 20, 20)

//        hotMountainListAdapter.setOnItemClickListener(object : MountainViewAdapter.OnItemClickListener{
//            override fun onItemClick(v: View, data: Int, pos : Int) {
//                Intent(activity, CourseDetailActivity::class.java).apply {
//                    putExtra("id", data)
//                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//                }.run { startActivity(this) }
//            }
//        })

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val lastVisibleItemPosition =
                    (recyclerView.layoutManager as LinearLayoutManager?)!!.findLastCompletelyVisibleItemPosition()
                val itemTotalCount = recyclerView.adapter!!.itemCount-1

                // 스크롤이 끝에 도달했는지 확인
                if (!recyclerView.canScrollVertically(1) && lastVisibleItemPosition == itemTotalCount && !itemFinished) {
                    hotMountainListAdapter.loadItem()
                    hotMountainApiCall(++page)
                    hotMountainListAdapter.deleteLoading()
                }
            }
        })



        return root
    }

    private fun hotMountainApiCall(page : Int) {
        val retrofit = RetrofitManager(Usage.ACCESS)
        retrofit.hotMountainList(page, completion = { status, list ->
            when (status) {
                RESPONSE_STATUS.OKAY -> {
                    //Log.d(Constants.TAG, "PhotoCollectionActivity - searchPhotoApiCall() called 응답 성공 / list.size : ${list?.size}")
                    if (list != null) {
                        this.courseList.clear()
                        this.courseList = list
                        hotMountainListAdapter.submitList(this.courseList)
                        hotMountainListAdapter.notifyDataSetChanged()
                        //Log.d(Constants.TAG,"여기까지 됨 $courseList")
                        //
//                        popularCourseAdapter.submitList(this.recCourseList)
//                        popularCourseAdapter.notifyDataSetChanged()
                    }
                }
                RESPONSE_STATUS.NO_CONTENT -> {
                    itemFinished = true
                    Toast.makeText(this.context, "마지막 페이지입니다.", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Log.d(
                        Constants.TAG,
                        "ProfileFragment-OncreateView-hotListApiCall() ${list.toString()}"
                    )
                    Toast.makeText(this.context, "페이지를 로드할 수 없습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
    override fun onResume() {
        super.onResume()
        val activity = activity as MainActivity?
        activity?.showUpButton()
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> {
            (activity as MainActivity?)!!.onBackPressed()
            true
        }
        R.id.main_menu_search -> {
            findNavController().navigate(R.id.action_navigation_home_to_searchActivity)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
//
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        callback = object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                sample_text.text = "occur back pressed event!!"
//            }
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        callback.remove()
//    }
}