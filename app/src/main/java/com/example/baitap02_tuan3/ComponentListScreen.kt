package com.example.baitap02_tuan3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ComponentList (navController: NavController) {
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
            .fillMaxSize()
    )
    Column (
        modifier = Modifier
            .padding(top = 30.dp)

    ){
        Text(
            text = "UI Components List",
            color = colorResource(R.color.primary_color),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ){
            Text(
                text = "Display",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("detail")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Text",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Display text",
                    )
                }
            }
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),// Bo góc
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("image")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Image",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Displays an image",
                    )
                }
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),

        ){
            Text(
                text = "Input",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("textfield")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "TextField",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Input field for text",
                    )
                }
            }
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),// Bo góc
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("password")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "PasswordField",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Input field for passwords",
                    )
                }
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
        ){
            Text(
                text = "Layout",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("column")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Column",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Arranges elements vertically",
                    )
                }
            }
            Surface(

                color = colorResource(R.color.secondary_color), // Màu nền của Surface
                shadowElevation = 4.dp, // Đổ bóng
                shape = RoundedCornerShape(12.dp),// Bo góc
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clickable {
                        navController.navigate("row")
                    }
            ) {
                Column (
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Row",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        fontSize = 20.sp,
                        text = "Arranges elements horizontally",
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ComponentListPreview () {
    val navController = rememberNavController()
    ComponentList(navController)
}