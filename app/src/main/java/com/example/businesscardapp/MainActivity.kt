package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface() {
                    Greeting(
                        name = "Thanh Tung",
                        role = " Mobile Developer",
                        )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, role: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Cyan
    )
    {


        Column(
            modifier,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center

        ) {
            Text(
                text = "Business Card",
                modifier = modifier,
                fontSize = 34.sp,
                color = Color.Black,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.dog),
                contentDescription = "Dog",
                modifier = Modifier.size(200.dp).clip(RoundedCornerShape(28.dp))
            )
            Text(
                text = " $name",
                modifier = modifier,
                fontSize = 34.sp,
            )
            Text(
                text = " $role!",
                modifier = modifier,
                fontSize = 15.sp,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.height(100.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.width(44.dp))
                Image(
                    painter = painterResource(id = R.drawable.ins),
                    contentDescription = "ins",
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "ttungnt05",
                    modifier = Modifier.padding(start = 10.dp).fillMaxWidth(),
                    fontSize = 20.sp,
                    color = Color.Black,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {

                Spacer(modifier = Modifier.width(44.dp))
                Image(
                    painter = painterResource(id = R.drawable.phoneee),
                    contentDescription = "phone",
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "  0123 456 789",
                    modifier = Modifier.padding(start = 1.dp).fillMaxWidth(),
                    fontSize = 20.sp,
                    color = Color.Black,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {

                Spacer(modifier = Modifier.width(44.dp))
                Image(
                    painter = painterResource(id = R.drawable.mail),
                    contentDescription = "mail",
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "tungtnt.23ite@vku.udn.vn",
                    modifier = Modifier.padding(start = 10.dp).fillMaxWidth(),
                    fontSize = 20.sp,
                    color = Color.Black,

                    )
            }

        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting("Thanh Tung"
            , "Mobile Developer")
    }
}