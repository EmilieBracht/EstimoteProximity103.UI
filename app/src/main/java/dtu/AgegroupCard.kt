package dtu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dtu.engtech.DB3_3.R

@Composable
fun AgegruopCard (
    agegroup: Agegroup,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(painter = painterResource((R.drawable.startside)),
            contentDescription = "Startside",
            modifier = Modifier
                .size(50.dp)
            )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = agegroup?.age?:""
            )

        }

    }

}