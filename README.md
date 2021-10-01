# 산갈래 : 등산 측정 및 등산로 추천 어플리케이션
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135642387-b356234e-7b88-4779-8d23-a82caa087ab5.gif" width = 100></p>

![KakaoTalk_20211001_235310121_01](https://user-images.githubusercontent.com/75845861/135642455-4e3b991e-af49-438a-b56f-6501be9fcb11.gif)
![KakaoTalk_20211001_235310121_02](https://user-images.githubusercontent.com/75845861/135642473-43ac9aec-c98c-4715-87b8-5f27c91d987c.gif)
![KakaoTalk_20211001_235310121_06](https://user-images.githubusercontent.com/75845861/135642502-8036469b-3fd1-4870-b0da-c6e2942de916.gif)
![KakaoTalk_20211001_235310121_05](https://user-images.githubusercontent.com/75845861/135642516-84da8c2e-bb05-42ef-b228-0dcd05012be2.gif)
![KakaoTalk_20211001_235310121_04](https://user-images.githubusercontent.com/75845861/135642525-5a455329-024f-44f3-984e-4ca120882b7b.gif)
![KakaoTalk_20211001_235310121_03](https://user-images.githubusercontent.com/75845861/135642533-35519de4-c3e6-46ce-b633-fec7175c2c86.gif)

## 개요
 ### 1. 주제 선정 배경  
 COVID-19로 인해 실내 운동이 제한됨에 따라 도심과 인접한 산을 찾는 등산객들의 수가 증가하고 있다. 초보 등산객들의 경우, 길을 잘못 들거나 등산로의 난이도를 잘 모르고 가벼운 차림으로 등산을 하다가 사고가 발생하는 경우가 많다. 또한 자신에게 맞는 수준의 등산로 정보를 구하기가 어렵다. 본 프로그램은 유저들에게 맞춤형으로 등산로를 추천하고 본인의 등산 데이터를 관리할 수 있는 서비스를 제공해주는 어플리케이션을 개발해 보다 더 안전하고 즐겁게 등산을 즐길 수 있도록 주제를 선정했다.
 ### 2. 목적  
 등산로 추천 및 측정 어플리케이션으로 유저의 수준에 적합한 난이도의 등산로를 추천하고, 산행 중에 길을 잃지 않도록 GPS 정보를 통해 경로를 안내한다. 원하는 길이와 수준의 경로를 검색할 수도 있고, 유저의 등산 데이터를 수집해 유저의 취향에 맞는 등산로를 추천한다.

## 기능
  ### 1. 주요 기능  
   1) **등산로/산 추천**  
  유저의 등산 기록과 등산로들의 메타데이터를 분석해 유저의 수준에 적합하고 취향에 맞는 등산로를 추천한다. 또한, 최근 24개월 이내에 따라가기 횟수가 많은 인기 등산로, 현재 계절의 순위를 반영한 인기 산 목록, 현재 유저의 위치로 부터 50km 이내에 있는 근처 산 목록을 제공한다.  
   2) **키워드 검색**  
  등산로명, 산 이름, 지역 명 등의 키워드로 검색을 하면 해당 키워드가 포함된 등산로 목록을 보여준다.  
  3) **등산로 안내 및 측정**  
 등산로 상세 페이지에서 따라가기 버튼을 클릭하면, 해당 등산로의 경로를 지도에 표시한다. 안내 시작 버튼을 클릭하면 측정 시간, 걸은 시간, 이동한 거리, 남은 거리, 현재 고도, 예상 도착 시간, 진행률을 화면에 표시한다. 3초 간격으로 현재 유저가 위치한 곳의 위도, 경도, 고도와 시간을 기록한다. 일시정지 버튼을 클릭하면 등산 안내 및 측정을 일시적으로 중단할 수 있다. 등산 측정이 끝나면 해당 등산 데이터는 GPX 파일로 생성되고, 로컬 저장소 및 서버 스토리지에 저장되어 유저가 언제든지 본인의 등산 기록을 확인할 수 있다.  
  4) **마이페이지, 등산 통계**  
  닉네임, 키, 몸무게 등 유저의 프로필을 직접 수정할 수 있고, 유저의 등산 통계 및 등산 기록 목록을 확인할 수 있다. 등산 통계 화면에서는 등산 거리, 등산 시간, 이동 시간, 오르막합, 내리막합, 속력, 페이스 등의 합계, 평균, 최고 기록을 제공하여, 유저의 등산 성향을 파악할 수 있다.  
  
## 데이터 수집 및 가공
### 1. 데이터 특성
GPX는 일정한 간격으로 위도, 경도, 고도, 측정 시각이 적힌 xml 형태의 파일로써 GPS 데이터의 집합이다. GPX 파일에 기록된 위도, 경도 리스트를 지도에 표시해 경로 안내를 할 수 있고, 해당 등산로의 전체 길이를 구할 수 있다. 또한, 기록된 시간 정보를 이용해 전체 시간, 이동 시간, 평균 속력 등을 계산하고, 고도를 이용해 오르막합, 내리막합, 고도 차 등을 계산하여 사용자에게 해당 등산로의 특성 및 난이도 정보를 제공할 수 있다.   
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135603040-f15ff016-f4bf-4d7a-988f-ea4c0a1f3640.png"></p>

### 2. 데이터 수집
등산 커뮤니티 ‘에브리트레일’ (http://www.everytrail.co.kr) 에서 9060개의 GPX 파일을 크롤링했다. 언어는 Python을 사용했고, 라이브러리는 BeautifulSoup와 Selenium을 사용했다. 수집한 GPX 파일들로부터 메타데이터와 썸네일을 추출해, 썸네일과 GPX 파일은 S3 스토리지에, 메타데이터는 데이터베이스에 저장했다.   
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135603140-0d3e0af6-7ba1-4d47-a6a0-e9e36662e943.png"></p>
  

### 3. 데이터 가공
1) **메타데이터 추출**  
크롤링한 gpx 데이터들로부터 ‘거리, 이동시간, 소요시간, 평균 속도, 평균 페이스, 위도, 경도, 주소, 최고 고도, 최소 고도, 고도차, 오르막합, 내리막합, 난이도, 기록 시각, 썸네일’ 메타데이터를 추출했다. 메타데이터 추출은 파이썬의 gpxpy 라이브러리를 사용했으며, 썸네일 생성은 Thunderforest API를 사용하여 등산로 경로가 그려진 썸네일을 생성했다. 아래 표는 각 속성 값들을 계산한 방법을 설명하고 있다.

  
<div align="center">
 
|속성|계산 방법|
|------|---|
|거리|파이썬 gpx 라이브러리의 length_3d 함수를 이용해 거리 추출|
|이동 시간|gpx 라이브러리의 get_moving_data 함수를 이용해 이동 시간 추출|
|소요 시간|끝점 시각 - 시작점 시각|
 |평균 속도|거리/이동 시간|
 |평균 페이스|평균 속도 km/h를 분/km 로 치환한 것|
 |위도|시작점의 위도|
 |경도|시작점의 경도|
 |주소|시작점의 위도, 경도를 구글 맵 API에 넘겨 받은 주소 문자열|
 |최고 고도|기록된 고도들 중 가장 큰 값|
 |최소 고도|기록된 고도들 중 가장 작은 값|
 |고도차|최고 고도 - 최소 고도|
 |오르막합|이전 점보다 고도 값이 커졌을 경우 그 차이를 누적해 더한 값|
 |내리막합|이전 점보다 고도 값이 작아졌을 경우 그 차이를 누적해 더한 값|
 |난이도|거리, 시간, 고도차를 기준으로 분류한 값|
 |기록 시각|끝점의 시각|
 |썸네일|파이썬의 PIL(ImageDraw) 라이브러리를 이용해 gpx의 점들을 연결한 선을 지도에 나타내어 png 파일로 저장함|
 
</div>   
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135604588-068b5a26-c309-462e-b8be-f89904e6cb63.png"></p>
  

2) **데이터 필터링**  
크롤링한 GPX 파일 중에서 등산 기록이 아닌 자전거, 차량, 비행기, 배 등 교통 수단을 이용하여 기록한 GPX 파일들이 섞여있었다. 이러한 파일들을 필터링하지 않는다면, 등산로 추천의 정확도를 떨어뜨릴 수 있으므로, 비정상적인 데이터들을 필터링해야 했다. 비정상적인 데이터를 제거하기 위해 메타데이터를 기준으로 필터링 과정을 거쳤다. 필터링 기준은 평균 속도 8km/h 이하, 최고 고도 3,000m 이하, 최저 고도 -1,000m 이상, 측정 시간 200시간 이하로 설정했다. 히말라야 산맥과 같은 국내 산이 아닌 해외의 산들은 주소를 기준으로 필터링 했다. 필터링 결과로 gpx 파일 9,060개 중 8,294개 파일을 사용한다.

## 추천 알고리즘
1) **Contents-Based Filtering**  
유저가 관심있는 아이템의 속성을 분석하여 이와 비슷한 새로운 아이템을 추천하는 것이다. 예를 들어 어떤 유저가 ‘A’ 라는 영화를 봤는데, A의 장르가 액션영화라면 해당 유저에게 다른 액션 영화를 추천하는 방식이다. 아이템을 비교하기 위해 아이템의 특성들을 선정하고 해당 특성들의 유사도를 비교해 비슷한 아이템을 추천하는 것이다. 등산로의 경우 유저의 이동 경로와 시간 정보가 gpx 파일의 형태로 기록이 된다. 이 gpx 파일은 시간, 위도와, 경도, 고도 정보가 포함된 point가 일정한 시간 간격으로 기록된 xml 파일이다. gpx 파일을 분석하면 유저의 이동 거리, 속도, 고도에 대한 정보들을 모두 수치화하여 얻을 수 있다. 따라서 유저에게 맞춤 등산로를 추천하기 위한 방법으로 Contents-Based Filtering이 적합하다고 판단했다. 유사도 비교를 위한 등산로의 비교 특성으로는 이동거리, 평균 속도, 최고 높이와 최저 높이의 고도차를 선정했다.

2) **유사도 비교 알고리즘**  
GPX 데이터간 유사도를 비교하기 위해 코사인 유사도와 유클리드 유사도를 사용하여, 생성된 목록들의 표본 표준편차가 더 작은 방식을 채택했다 . 코사인 유사도는 두 개의 벡터값에서 코사인 각도를 계산한다. 벡터의 크기에 영향을 받지 않으며 범위는 -1 ~ 1이며, 1에 가까울수록 유사하다. 유클리드 유사도는 유클리디언 거리를 이용해 계산한다. 벡터의 크기에 영향을 받으며 0에 가까울수록 유사하다.  
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135604960-9a14df48-16e9-4e02-bdb7-78f8b1cd89be.png"></p>  
속도, 고도, 거리의 범위가 다르기 때문에, 유사도 계산 전에 스케일링, 정규화 과정을 거쳤다. 코사인 유사도는 Standard Scaling, Min Max Scaling, Max Abs Scaling, Robust Scaling 총 4가지 기법을 적용했으며, 유클리드 유사도는 L1 정규화를 적용했다. 각 스케일링 및 정규화의 특징은 다음과 같다.  
<div align="center">
 
|스케일링/정규화|특징|
|------|---|
|Standard Scaling |기본 스케일. 평균을 0으로 표준편차를 1로 변환|
|Min Max Scaling|최대 / 최소값이 각각 1, 0이 되도록 스케일링|
|Max Abs Scaling|최대 절대값이 1이 되도록 스케일링|
|Robust Scaling|중앙값과 IQR(Interquartile Range)이 각각 0, 1이 되도록 스케일링|
|L1 정규화|두 개의 벡터를 빼고 절댓값을 취한뒤 합함|
 
</div>
  

아래 사진은 비교 대상인 gpx id 2, 3번에 대해 Standard Scaling을 적용한 후 코사인 유사도를 계산했을 때, 유사도가 높은 순으로 출력된 리스트의 일부이다. 비교 대상 gpx의 평균 속도, 고도 차이, 거리와 출력된 리스트들의 평균 속도, 고도 차이, 거리가 비슷한 것을 확인할 수 있다.  
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135605413-d3676fd4-b78f-4314-8ff6-aef14e94d385.png"></p>

보다 더 정확한 비교를 위해, 표본 표준편차와 표본 평균값을 이용하여 비교했다. 랜덤으로 30개의 표본을 추출해 다섯가지 유사도 계산 방법을 각각 적용한 결과는 아래와 같다. 이 중에서 표본 표준편차가 가장 작게 나온 max abs 스케일링을 적용한 코사인 유사도 방식을 택했다.  
<p align="center"><img src="https://user-images.githubusercontent.com/75845861/135605505-31260e64-aeda-4497-b42f-18959c673d68.png"></p>


## 안드로이드
### 1. 시스템 사양
> 언어: kotlin
최소 SDK : 23
Target SDK : 30
JVM version 1.8
### 2. API 및 라이브러리
1) **Naver Map API**  
등산 경로를 지도상에 표시하고 등산로 경로 안내를 위해 Naver Map API를 사용했다. 특정 위도, 경도 값을 지도에 표시하는 기능을 이용하여 GPX 파일을 읽어서 등산로를 지도에 표시한다. 또한, 유저의 현재 위치를 지도에 표시하고, 현재 위도, 경도, 고도 값을 받아와서 GPX 파일에 기록하고 등산 측정에 이용한다.
2) **Retrofit**  
본 프로그램의 API 서버와 통신하기 위해 Retrofit 라이브러리를 사용했다. Retrofit은 안드로이드 애플리케이션에서 서버와 HTTP 통신을 해서, 서버로부터 받은 데이터를 앱에서 출력해 사용자가 볼 수 있게 하는 라이브러리이다. REST 기반의 웹 서비스를 통해 JSON 구조의 데이터를 쉽게 가져오고 업로드할 수 있다.
3) **JPX**  
JPX는 GPX 파일을 읽고, 쓰고, 생성할 수 있는 Java 라이브러리이다. JPX를 사용하여 등산 기록을 측정하고 GPX 파일을 기록하는 모듈을 개발했다.

### 3. 화면 리스트
1) **홈 화면**  
  홈화면에서는 나만의 맞춤 등산로, 인기 있는 등산로, 인기 있는 산, 가까운 산 추천 목록들을 제공한다. horizontal listview로 구성되어 옆으로 넘기며 10개의 아이템을 볼 수 있고, 아이템을 클릭하면 해당 등산로 상세 페이지로 전환된다. 더보기를 누르면 vertical listview로 전체 목록을 보여준다. 위 기능을 사용하기 위해 GPS 권한이 필요하다.
  - **홈 화면 Request**  
  Request URI: /course/main  
  Http Protocol: GET  
  Query: latitude, longitude  

  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607028-604575a9-b01a-4bee-9ba4-3af16b9465e5.png"></p>  

  - 맞춤 등산로  
    서버에 저장된 등산로들 중 유저의 등산 기록에 해당하는 GPX 메타 데이터와 유사한 순으로 추천한다.
  - 인기 등산로  
    유저들이 등산로 상세 페이지에서 ‘따라가기’ 버튼을 누를 때마다 해당 course_id의 따라가기 횟수를 증가시킨다. 인기 등산로는 최근 24개월 이내 따라가기 횟수가 많은 순으로 나타난다(record 테이블의 count(course_id)).
  - 인기 산  
    [한국의 산하 인기명산 100위의 계절별 순위] 에서 현재 계절에 해당하는 산 순위대로 추천한다. 계절마다 인기 산 추천 테이블을 갱신한다.
  - 가까운 산  
    유저가 홈 화면에 진입할 때마다 현재 위도, 경도 값을 받아 서버에 전달하면 서버는 위도, 경도차가 작은 순으로 등산로 목록을 반환한다. 가까운 산 목록은 메인 홈 화면에서만 제공하고 더보기 목록은 제공하지 않는다. 유저의 위치 기준 50km 이내에 위치한 산의 사진과 이름을 보여준다. 이 기능을 사용하기 위해 GPS 권한이 필요하다.

  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607078-3b6a2172-abff-4bae-a2fd-8a964a6939de.png"></p>

  - 더보기  
    맞춤 등산로, 인기 등산로, 인기 산 목록은 더보기를 클릭하면 리스트뷰 형태로 더 많은 목록들을 제공한다. 썸네일과 함께 등산로/산 이름, 거리, 고도차, 시간, 난이도 정보를 표시한다. 더보기 목록 화면에서 아래로 스크롤하게 되면 페이징 처리되어 20개씩 계속 서버에서 목록들을 불러와 보여준다.
  - 상세 페이지  
    추천 목록에서 아이템을 클릭하면 해당 등산로 상세 페이지로 전환된다. 상세 페이지에서는 썸네일과 함께 소재지, 등산 거리, 이동 시간 (해당 등산로를 기록한 유저가 실제로 이동한 시간), 소요 시간 (휴식 시간을 포함한 전체 소요 시간), 평균 속도, 평균 페이스, 최고 높이, 최소 높이, 고도차, 오르막합, 내리막합, 난이도, 기록된 날짜를 보여준다. ‘다운로드’ 버튼을 클릭하여 해당 등산로의 GPX 파일을 다운로드 할 수 있으며, ‘따라가기’ 버튼을 클릭하여 해당 등산로 경로 안내를 시작할 수 있다.

  - **맞춤 등산로 Request**  
  Request URI: /course/recommendation  
  Http Protocol: GET   
  Query: page  

  - **인기 등산로 Request**  
  Request URI: /course/hot  
  Http Protocol: GET  
  Query: page(Int)  

  - **인기 산 Request**  
  Request URI: /mountain/hot  
  Http Protocol: GET  
  Query: page  

  
  
  
2) **검색**   
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607406-77d5f9f1-cbd4-4f35-a4d6-56c39373c79f.png"></p>

 앱 상단의 돋보기 아이콘을 클릭하면 등산로 키워드 검색 기능을 사용할 수 있다. 등산로명, 산 이름, 지역명등 등산로에 관련된 키워드로 검색하면 해당 키워드와 관련된 등산로 목록을 서버에서 검색해 결과를 보여준다. 마찬가지로 아래로 스크롤하면 페이징 처리되어 20개씩 목록을 업데이트한다. 아이템을 클릭하면 해당 등산로 상세 페이지로 전환된다.
   
  - **키워드 검색 Request**  
  Request URI: /search  
  Http Protocol: GET  
  Query: keyword, page  

  
    
    
3) **찜**  
   찜 화면에서는 내가 찜한 등산로 목록들을 확인할 수 있다. 아이템을 클릭하면 등산로 상세페이지로 전환되고 상세페이지에서 하트 아이콘을 클릭함으로써 찜 목록에 추가하거나 제거할 수 있다.  
   <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607556-f3ff3990-20e2-411b-8df6-9707d493f335.png"></p>

  - **찜 목록 Request**  
  Request URI: /favorite  
  Http Protocol: GET  
  Query: none  

  - **찜 목록 추가 / 제거 Request**  
  Request URI: /favorite  
  Http Protocol: POST  
  Json Body: course_id  

  - **등산로 상세 페이지 Request**  
  Request URI: /course/{id}  
  Http Protocol: GET  
  Path: course id  

  
  
4) **지도**  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607776-04b192c7-34bc-4c1d-9360-3a1593b970f3.png"></p>


 - GPX 파일 다운로드  
  등산로 상세 페이지에서 다운로드 버튼을 누르면 해당 등산로 GPX 파일이 S3 서버 스토리지에서 로컬 저장소에 다운로드된다. 따라서 gpx를 다운로드 할 때에는 API 서버에 http request를 전송하지 않고 직접 S3에서 다운로드 한다. 위 기능을 사용하기 위해 로컬 저장소에 쓰기 권한이 반드시 필요하다.
  - 따라갈 등산로 표시  
  상세 페이지에서 ‘따라가기’ 버튼을 누르면 해당 등산로 GPX 파일을 S3 Storage에서 로컬 저장소에 다운로드하고, 경로를 지도 화면에 그려 빨간색 선으로 표시한다. 위 기능을 사용하기 위해 로컬 저장소에 접근 권한이 필요하다.  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607902-fb84b6e1-9b8d-43fc-8241-07dfa4ae43a1.png"></p>

 - 측정 정보 표시  
  일시정지 상태가 아닐 때 3초에 한 번씩 위도, 경도, 고도, 현재 시간 데이터를 리스트에 추가하고, 추가된 점들 사이의 거리차를 계산해 이동한 거리, 남은 거리와 측정 시간, 걸은 시간, 현재 고도, 예상 도착 시간을 화면에 표시한다.  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135607969-f8cce9fb-f3d0-4c91-81c7-7ac382dd7a04.png"></p>

 - GPX 파일 저장  
  등산 측정이 종료되면 리스트에 포함된 데이터들을 GPX 파일로 생성한 뒤, 휴대폰의 로컬 저장소와 S3 스토리지에 저장한다. S3에 저장이 완료되면 GPX 파일의 접근 링크를
  메타데이터와 함께 데이터베이스의 Record 테이블에 추가한다. 위 기능을 사용하기 위해 로컬 저장소에 쓰기 권한이 필요하다.  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135608063-07ec4185-204d-4d3b-9ac8-2f21ed38b695.png"></p>  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135608091-31f29591-75c0-463f-83d3-ac475159fe20.png"></p>   
    
- 메타데이터 저장    
 측정이 종료되면 등산 측정 시 기록한 메타데이터와 S3 접근 링크를 데이터베이스의 Record 테이블에 저장한다.  
 메타데이터: 총 거리, 총 측정 시간, 걸은 시간, 최고/최저 고도, 고도차, 위도, 경도, 오르막합, 내리막합, 평균 속도, 평균 페이스, 칼로리, gpx 저장 경로, 측정 일시  
- 등산 기록 저장 Request  
 Request URI: /favorite  
 Http Protocol: POST  
 Json Body: course, title, filename, distance, moving_time_sec, total_time_sec, moving_time_str, total_time_str, avg_speed, avg_pace, location, latitude, longitude, max_height, min_height, ele_dif, total_uphill, total_downhill, difficulty, calorie ,date, gpx_url, thumbnail  

    
    
    
5) **마이페이지**  
  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135608225-6b304a26-868c-4ad6-8af9-2ea09845a1be.png"></p>  
    
- 프로필 설정    
 연필 아이콘을 클릭하면 유저가 직접 닉네임, 키 몸무게를 변경할 수 있다. 확인 버튼을 누르면 textview의 내용이 서버로 전달되어 데이터베이스의 user 테이블에 저장된 유저의 닉네임, 키, 몸무게를 업데이트한다. 키, 몸무게는 등산 측정 시 소모한 칼로리 계산에 이용된다.  
- 프로필 설정 Request  
 Request URI: /user  
 Http Protocol: POST  
 Json Body: nickname, height, weight  


- 등산 통계  
 record 테이블에 저장된 유저의 등산기록 데이터를 사용하여 ‘총 등산 거리, 평균 등산 거리, 최고 등산 거리(단일 등산 기록 중 최대 거리), 총 등산 시간, 평균 등산 시간, 최고 등산 시간, 총 이동 시간, 평균 이동 시간, 최고 이동 시간, 평균 높이, 최고 높이, 평균 속도, 최고 속도, 평균 페이스, 최고 페이스, 총 오르막합, 평균 오르막합, 최고 오르막합, 총 내리막합, 평균 내리막합, 최고 내리막합, 총 소모 칼로리, 평균 소모 칼로리’를 나타낸다. 해당 기록을 이용하여 유저의 등산 성향을 파악할 수 있고, 이를 이용하여 추천 등산로 목록을 제공한다.

- 유저 프로필, 통계 Request  
 Request URI: /user  
 Http Protocol: GET  
 Query: none  

  <p align="center"><img src="https://user-images.githubusercontent.com/75845861/135608385-f9ffb0e3-59f7-47a2-9e26-6bf707a8ece7.png"></p>  
  
 - 등산 기록  
 ‘‘내 등산 기록’ 글자 옆 ‘ > ’ 버튼을 누르면 등산 기록 페이지로 전환된다. 등산 기록 페이지에서는 측정된 유저의 등산 기록들을 최신 날짜 순으로 볼 수 있다. 등산 기록의 제목과 측정한 날짜를 보여준다.  

- 등산 기록 목록 Request  
 Request URI: /record  
 Http Protocol: GET  
 Query: none  


## 파일 설명


> Platform: Android
Server Framework: SpringBoot 2.4.4
Web server: Nginx
WAS: Django 3.1.7
Database: Mariadb 10.4.13
Cloud Storage: AWS S3
Cloud Server Hosting: AWS EC2
Cloud Database: AWS RDS
