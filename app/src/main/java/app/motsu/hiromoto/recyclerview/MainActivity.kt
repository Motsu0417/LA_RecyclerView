package app.motsu.hiromoto.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val courseDatas: List<CourseData> = listOf(
        CourseData(R.drawable.android, "Androidアプリプログラミングコース", "色んなアプリを作って、プログラミングを楽しもう"),
        CourseData(R.drawable.iphone, "iPhoneアプリプログラミングコース", "世界に一つだけiPhoneアプリを作って、周りを驚かせよう！"),
        CourseData(R.drawable.unity, "Unityゲームプログラミングコース", "世界を驚かすワクワクが止まらない！3Dゲームを制作しよう!")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}