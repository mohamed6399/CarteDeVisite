package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MacarteDeVisite()
        }
    }
}
@Composable
fun MacarteDeVisite() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logopush),
            contentDescription = "Logo push",
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "OUATTARA MOHAMED ",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Développeur mobile",
            fontSize = 18.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(90.dp))

        ContactInfo(icon = Icons.Filled.Phone, contactText = "+225 07 48 97 70 81                    ")
        Spacer(modifier = Modifier.height(15.dp))
        ContactInfo(icon = Icons.Filled.Email, contactText = "lamine99ouattara2@gmail.com")
    }
}

@Composable
fun ContactInfo(icon: ImageVector, contactText: String) {
    Row(verticalAlignment = Alignment.CenterVertically,

        ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF3DDC84)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = contactText, fontSize = 16.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MacarteDeVisite()
}