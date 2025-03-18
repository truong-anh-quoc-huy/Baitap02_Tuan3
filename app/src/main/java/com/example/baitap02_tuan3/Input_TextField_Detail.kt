package com.example.baitap02_tuan3

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.traceEventStart
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
fun Input_TextField_Detail(navController: NavController) {
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
            text = "Text Field Detail",
            color = colorResource(R.color.primary_color),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    var username = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxHeight(0.7f)
        ,
        contentAlignment = Alignment.Center
    ) {
        Surface(
            color = colorResource(R.color.secondary_color),
            modifier = Modifier
                .padding(20.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column (
                modifier = Modifier
                    .padding(30.dp)
            ){
                Text(
                    "Nhập tài khoản",
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                TextField(
                    value = username.value,
                    onValueChange = { username.value = it }, // Cập nhật giá trị khi nhập
                    label = { Text("") },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent)

                )
                Text(
                    "Nhập mật khẩu",
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                TextField(
                    value = password.value,
                    onValueChange = { password.value = it }, // Cập nhật giá trị khi nhập
                    label = { Text("") },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent)
                )
                ElevatedButton (
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth().padding(10.dp),
                ) {
                    Text(
                        "Đăng nhập",
                        modifier = Modifier
                            .padding(10.dp)
                    )
                }
            }
        }


    }
}
