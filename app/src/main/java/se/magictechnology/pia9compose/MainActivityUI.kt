package se.magictechnology.pia9compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivityUI {

    @Composable
    fun MainUI(mynumber : MutableState<Int>, people : MutableList<String>)
    {
        Column {
            Greeting("Banan")

            if(mynumber.value > 5)
            {
                Row {
                    FancyBox()
                    FancyBox()
                    FancyBox()
                }
            }


            Button(onClick = {
                Log.d("pia9debug", "CLICK BUTTON")
                people.add("Torsten")

                mynumber.value = mynumber.value + 1

            }, modifier = Modifier.padding(20.dp)) {
                Text(text = "Tryck här! ${mynumber.value}")
            }

            LazyColumn {
                items(people) {
                    PersonComponents().PersonRow(personname = it)
                }
            }

        }
    }

    @Composable
    fun Greeting(name: String) {
        MaterialTheme {
            val typography = MaterialTheme.typography

            Column(modifier = Modifier.padding(16.dp) ) {

                Image(
                    painter = painterResource(id = R.drawable.frog),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Tjena", style = typography.h6)
                Text(text = "Hello $name!", style = typography.body2)
                Text(text = "Goddag")
            }
        }
    }

    @Composable
    fun FancyBox()
    {
        Text(text = "HEJ", modifier = Modifier.padding(8.dp))
    }
}