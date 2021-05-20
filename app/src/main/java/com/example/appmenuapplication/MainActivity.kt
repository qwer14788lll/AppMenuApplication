package com.example.appmenuapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmenuapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private val appList = ArrayList<App>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initAppList()
        mBinding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        val adapter = AppAdapter(this, appList)
        mBinding.recyclerView.adapter = adapter
    }
    private fun initAppList() {
        appList.clear()
        repeat(100000){
            appList.add(App("测试","测试",R.drawable.img_bg))
        }
    }
}