package com.example.baitap02_tuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baitap02_tuan3.ui.theme.Baitap02_Tuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Baitap02_Tuan3Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "start") {
                    composable("start") { startScreen(navController)  }
                    composable("detail") { Display_Text_Detail(navController)  }
                    composable("list") { ComponentList(navController)  }
                    composable("image") { Display_Image_Detail(navController) }
                    composable("textfield") { Input_TextField_Detail(navController) }
                    composable("password") { Input_PasswordField_Detail(navController) }
                    composable("row") { Layout_Row_Detail(navController) }
                    composable("column") { Layout_Column_Detail(navController) }
                }
            }
        }
    }
}

@Composable
fun startScreen (navController: NavController) {
    Box(
        Modifier.fillMaxSize()
    )
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
            ) {
            Image(
                painter = painterResource(R.drawable.logo_jetpackcompose),
                contentDescription = "Jetpack Compose Logo",
                modifier = Modifier
                    .size(230.dp)
            )
            Column {
                Text(
                    text = "Jetpack Compose",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                )
                Text(
                    text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()

                )
            }

            ElevatedButton(
                onClick = {
                    navController.navigate("list")
                },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = colorResource(R.color.primary_color), contentColor = Color.White),
            ) {
                Text(
                    text = "I'm ready",
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp

                )


            }
        }

    }
}


