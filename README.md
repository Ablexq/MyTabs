# MyTabs

### 效果图:

![](https://github.com/Ablexq/MyTabs/blob/master/pic/a.jpg)


一、Drawable的使用：

```

Drawable drawableSelect1 = getResources().getDrawable(R.drawable.tab1_icon_select);//获取图片
drawableSelect1.setBounds(0, 0, drawableSelect1.getMinimumWidth(), drawableSelect1.getMinimumHeight());//必须
tab1.setCompoundDrawables(null, drawableSelect1, null, null);//左上右下，设置图片在文字的上面
tab1.setTextColor(Color.parseColor("#3082f2"));
tab1.setCompoundDrawablePadding(3);//单位px

```


二、水波纹：

![](https://github.com/Ablexq/MyTabs/blob/master/pic/b.png)



drawable-v21:

```

<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/reveal_color">
    <item
        android:id="@android:id/mask"
        android:drawable="@color/red"/>
</ripple>

```

兼容低于api21：drawable.xml:

```

<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android"
    android:exitFadeDuration="@android:integer/config_mediumAnimTime">

    <item android:drawable="@color/reveal_color" android:state_pressed="true" />
    <item android:drawable="@android:color/transparent" />

</selector>

```

三、RadioButton的使用：

```
<?xml version="1.0" encoding="utf-8"?>
<RadioGroup xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/radioGroup"
    android:layout_width="fill_parent"
    android:layout_height="56dp"
    android:gravity="center"
    android:orientation="horizontal"
    tools:context="example.com.mytabs.MainActivity">

    <RadioButton
        android:id="@+id/btn1"
        style="@style/radio"
        android:drawableTop="@drawable/tab1_icon_select"
        android:text="@string/tab1"
        android:textColor="#3082f2" />

    <RadioButton
        android:id="@+id/btn2"
        style="@style/radio"
        android:drawableTop="@drawable/tab2_icon_default"
        android:text="@string/tab2"
        android:textColor="#000000" />

    <RadioButton
        android:id="@+id/btn3"
        style="@style/radio"
        android:drawableTop="@drawable/tab3_icon_default"
        android:text="@string/tab3"
        android:textColor="#000000" />

</RadioGroup>


```


```
  <style name="radio">
        <item name="android:layout_width">0dp</item>
        <item name="android:layout_height">match_parent</item>
        <item name="android:layout_weight">1</item>
        <item name="android:background">@drawable/ripple</item>
        <item name="android:drawablePadding">1dp</item>
        <item name="android:gravity">center_horizontal</item>
        <item name="android:textSize">12sp</item>
        <item name="android:button">@null</item>//取消默认button样式
    </style>

```



