package dtu

import android.provider.SyncStateContract
import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dtu.core.Constants
import dtu.core.Constants.FIREBASETAG

@Composable
fun AgegroupList(
    list: List<Agegroup>,
    modifier: Modifier = Modifier

) {
    Log.d(Constants.FIREBASETAG, "AgegroupList size: ${list.size}")
    LazyColumn(modifier = modifier
    ) {
        items(
            items = list
        ) { agegroup ->
            AgegruopCard(
                agegroup = agegroup
            )

        }
    }
}


