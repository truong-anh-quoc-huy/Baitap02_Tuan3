package com.example.baitap02_tuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController

@Composable
fun Display_Image_Detail(navController: NavController) {

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
            text = "Image Detail",
            color = colorResource(R.color.primary_color),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .zIndex(5f)
        )
    }
    Box (
        modifier = Modifier
            .fillMaxSize()
            .zIndex(2f),
        contentAlignment = Alignment.Center,

    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.logo_jetpackcompose_2),
                contentDescription = "Image",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .padding(bottom = 20.dp)
            )
            Text(
                text = "Image Detail",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.primary_color),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )
            Text(
                text = "painter = painterResource()\n" + " contentDescription = \" \",",
                fontSize = 20.sp
            )
        }

    }
}
