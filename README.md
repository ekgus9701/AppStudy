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

