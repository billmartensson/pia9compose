package se.magictechnology.pia9compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.magictechnology.pia9compose.ui.theme.Pia9composeTheme

class PersonComponents {
    @Composable
    fun PersonRow(personname : String)
    {
        Row(modifier = Modifier.padding(5.dp)) {
            Image(painter = painterResource(id = R.drawable.frog), contentDescription = null,
                modifier = Modifier.height(50.dp))
            Spacer(modifier = Modifier.width(25.dp))
            Text(text = personname)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PersonPreview() {
    Pia9composeTheme {
        PersonComponents().PersonRow(personname = "Torsten")
    }
}