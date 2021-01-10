# AppStudy
현직 개발자가 알려주는 안드로이드 앱 쉽게 만드는 방법을 보고 작성한 코드

https://www.inflearn.com/course/%ED%98%84%EC%A7%81%EA%B0%9C%EB%B0%9C%EC%9E%90-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%95%B1/dashboard

## 강의 1_TextView

![#1_text view](https://user-images.githubusercontent.com/52192706/103891569-6bddac80-512d-11eb-898f-cb24b595dfee.JPG)

1.기본적인 text 출력

2. text 색 선택

3. text 크기 선택

4. text 방향 선택

activity_main.xml
```
 android:orientation="vertical" //텍스트 방향
<TextView
android:layout_width="match_parent" //부모의 길이(기존 앱 넓이)만큼을 따라해라
android:layout_height="wrap_content" //텍스트 크기만큼 세로길이를 감싸라
android:textColor="#8F64DD" //색 선택
android:textSize="50sp" //텍스트 크기 선택 (sp단위)
android:text="my first app"/> //텍스트 출력 및 TextView 끝내기
```

## 강의 2_EditText

![#2 EditText](https://user-images.githubusercontent.com/52192706/103891573-6d0ed980-512d-11eb-910c-9ba26fbe959d.JPG)

1. hint(연한색 text) text 만들기

2. 버튼 만들기

3. 버튼 누르면 자동으로 텍스트가 hint text 자리에 들어감

activity_main.xml
```
android:id="@+id/et_id" //id하고 enter 2번 누르면 자동으로 @+id나옴
android:layout_width="300dp" //dp는 cm같은 단위
```

## 강의 3,4_IntentEx/ImageView&Toast

![#3 Intent1](https://user-images.githubusercontent.com/52192706/104125940-4525ad00-539d-11eb-982e-b3c9f30f55d3.JPG)
![#3 Intent2](https://user-images.githubusercontent.com/52192706/104125944-4656da00-539d-11eb-8f4c-5ea89b00c32f.JPG)

1. 버튼만들기

2. main activity에서 sub activity로 버튼을 누르면 넘어감

3. main activity에서 텍스트(dd)를 적고 버튼을 누르면 sub activity로 넘어가면서 적은 텍스트가 출력

![#4 ImageView Toast](https://user-images.githubusercontent.com/52192706/104125947-48209d80-539d-11eb-9048-e13fa6200222.JPG)

1. ImageView를 넣음

2. ImageView를 클릭하면 내가 그전에 코드에 작성해둔 텍스트(dh)가 팝업형태로 뜸(toast)

3. ImageView를 왼쪽 오른쪽 가운데로 옮길 수 있음

```
<LinearLayout
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
    android:gravity="right">//오른쪽으로 옮김
    
   <ImageView
       android:id="@+id/test"
       android:layout_width="100dp"
       android:layout_height="100dp"
       android:src="@mipmap/ic_launcher"/> //이미지 소스

</LinearLayout>
```

## 강의 5_패키지 구조&역할 설명

<res 패키지>

-drawable: 주로 이미지 폴더를 담당

-layout: 액티비티와 연결하는 레이아웃 파일들을 담당

-mipmap: 기본 제공하는 앱 아이콘들이 존재

-values 

: 원하는 컬러 선언(colors.xml),

: 긴 문장이나 중복이 많은 문장을 적고이용 (strings.xml)

: 앱테마,커스텀테마 만듦(styles.xml)

AndroidManifest.xml(manifests폴더를 클릭)

```
<application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher" //컨트롤클릭하면 기본 아이콘모양 설정가능
        android:label="@string/app_name" //컨트롤클릭하면 앱실행시 이름 설정가능
        android:roundIcon="@mipmap/ic_launcher_round" // 아이콘 둥글게 설정
        android:supportsRtl="true"
        android:theme="@style/Theme.IntentEx"> //컨트롤클릭하면 앱의 테마 기본 3색 확인
        <activity android:name=".SubActivity"></activity>
	//manifest는 액티비티의 선언 담당
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" /> //이 액티비티가 MAIN

                <category android:name="android.intent.category.LAUNCHER" /> //런처를 뜻함
            </intent-filter>
        </activity>
    </application>

</manifest>
```
