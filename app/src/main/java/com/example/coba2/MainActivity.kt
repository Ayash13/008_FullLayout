package com.example.coba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coba2.ui.theme.Coba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            "M AYASH Al-FATIH",
            style = TextStyle(
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold
            ),
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Card1()
        Spacer(modifier = Modifier.padding(5.dp))
        Text1()
        Spacer(modifier = Modifier.padding(10.dp))
        Card2()
    }
}

@Composable
fun Card1() {
    val background = R.drawable.background
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(370.dp),
        shape = RoundedCornerShape(15)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = background),
                contentDescription = "Background Image",
                modifier = Modifier
                    .size(320.dp)
                    .padding(15.dp)
            )
            Text(
                text = "Rain",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black,
                    fontSize = 25.sp
                )
            )
        }
    }
}

@Composable
fun Text1() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "19 C",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                fontSize = 50.sp,
            )
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_pin_drop_24),
                contentDescription = "Background Image",
                modifier = Modifier
                    .size(40.dp),
            )
            Text(
                text = "Yogyakarta",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black,
                    fontSize = 25.sp,
                )
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        )
    }
}

@Composable
fun Card2() {
    Card(
        modifier = Modifier
            .fillMaxSize(), shape = RoundedCornerShape(15)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            TextLeft()
            TextRight()
        }
    }
}

@Composable
fun TextLeft() {
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "Humidity",
            style = TextStyle(
                fontWeight = FontWeight.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "98%",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "Sunrise",
            style = TextStyle(
                fontWeight = FontWeight.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "05.00 AM",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
        )
    }
}

@Composable
fun TextRight() {
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "UV Index",
            style = TextStyle(
                fontWeight = FontWeight.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "9/10",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "Sunset",
            style = TextStyle(
                fontWeight = FontWeight.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "05.40 PM",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Coba2Theme {
        HomeScreen()
    }
}