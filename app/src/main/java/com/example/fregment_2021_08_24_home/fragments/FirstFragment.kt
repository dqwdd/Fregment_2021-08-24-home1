package com.example.fregment_2021_08_24_home.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fregment_2021_08_24_home.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

//    xml + kt의 조합 > 연결을 어떻게?
//    kt단에서 어떤 xml을 쓸지 연결 (전용 함수 존재)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?) : View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


//    동작 관련 코드들이 작성되는 함수 => 액티비티 : onCreate
//    이 클래스는 화면이 만들어진게 아니라 올라간 부품이 만들어 진거임
//    먼저 만들어 놓고 그 다음에 올리는 거임
//    ==> 프래그먼트의 onCreate는 화면도 준비되기 전 -> 동작시키면 에러 소지가 높다


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        logBtn.setOnClickListener {
            Log.d("부품에서 찍기", "로그 버튼이 눌림")
        }
    }

}

