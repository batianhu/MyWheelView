# MyWheelView
滑动选择器

## How to use
in xml :
 
	<com.example.weijunpeng.mygradle.WheelView
        android:id="@+id/wheelviewmain"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true">
    </com.example.weijunpeng.mygradle.WheelView>



in activity:
     

    private static final String[] PLANETS = new String[]{"河南", "安徽", "北京", "天津", "广东", "福建", "深圳", "浙江"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        wva.setOffset(1);
        wva.setItems(Arrays.asList(PLANETS));
        wva.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
            @Override
            public void onSelected(int selectedIndex, String item) {
                Log.d(TAG, "selectedIndex: " + selectedIndex + ", item: " + item);
            }
        });


    }
}
