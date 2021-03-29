package se.magictechnology.pia9compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.magictechnology.pia9compose.ui.theme.Pia9composeTheme
import se.magictechnology.pia9compose.ui.theme.Typography
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    var people = mutableListOf<String>()

    var mynumber = mutableStateOf(0)


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        people.add("Arne")
        people.add("Bengt")
        people.add("Caesar")


        setContent {
            Pia9composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainActivityUI().MainUI(mynumber, people)
                }
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pia9composeTheme {
        MainActivityUI().MainUI(mutableStateOf(0), mutableListOf<String>())

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Pia9composeTheme {
        PersonComponents().PersonRow(personname = "Torsten")
    }
}