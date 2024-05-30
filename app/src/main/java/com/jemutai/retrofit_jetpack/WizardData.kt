package com.jemutai.retrofit_jetpack

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun  WizardData(modifier: Modifier, viewModel: MyViewModel){

    val data = viewModel.hse.observeAsState().value

    if (data !=null){

        Text(text = data, modifier = modifier.padding(18.dp))
    }

}