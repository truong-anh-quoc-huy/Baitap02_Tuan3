package com.example.baitap02_tuan3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Display_Text_Detail(navController: NavController) {
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
            text = "Text Detail",
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
        Column {
            Row (modifier = Modifier
                .padding(5.dp)){
                Text(
                    text = "The",
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(
                    text = "quick",
                    fontSize = 40.sp,
                    textDecoration = TextDecoration.LineThrough,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(
                    text = "Brown",
                    fontSize = 40.sp,
                    color = Color(0xFFA0522D),
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row (modifier = Modifier
                .padding(5.dp)){
                Text(
                    text = "fox",
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(
                    text = "jumps",
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(
                    text = "over",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row (modifier = Modifier
                .padding(5.dp)){
                Text(
                    text = "line",
                    fontSize = 40.sp,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(
                    text = "lazy",
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(10.dp),
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = "dog.",
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        }

    }
}
@Preview (showBackground = true)
@Composable
fun aaaaa() {
    val navController = rememberNavController()
    Display_Text_Detail(navController)
}