package com.aperfectpolygon.polygon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aperfectpolygon.polygon.ui.theme.PolygonTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			PolygonTheme {
				// A surface container using the 'background' color from the theme
				Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
					Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Row(modifier = Modifier.padding(all = 8.dp)) {
		Image(
			painter = painterResource(R.drawable.ic_launcher_foreground),
			contentDescription = "Contact profile picture",
			modifier = Modifier
				// Set image size to 40 dp
				.size(40.dp)
				// Clip image to be shaped as a circle
				.clip(CircleShape)
		)

		// Add a horizontal space between the image and the column
		Spacer(modifier = Modifier.width(8.dp))

		Column {
			Text(text = "hello")
			// Add a vertical space between the author and message texts
			Spacer(modifier = Modifier.height(4.dp))
			Text(text = "World")
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	PolygonTheme {
		Greeting("Android")
	}
}