package com.example.baitap02_tuan3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Layout_Row_Detail(navController: NavController) {
    Box (modifier = Modifier
        .padding(15.dp),
    ) {
        IconButton(
            onClick = {
                navController.popBackStack()
            },
            modifier = Modifier.padding(start = 2.dp, top = 8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                contentDescription = null,
                tint = colorResource(R.color.primary_color)
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Row Detail",
            color = colorResource(R.color.primary_color),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Box (
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Row {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(80.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.primary_color))
            ){}
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(80.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.primary_color))
            ){}
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(80.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = colorResource(R.color.primary_color))
            ){}


        }
    }
}
