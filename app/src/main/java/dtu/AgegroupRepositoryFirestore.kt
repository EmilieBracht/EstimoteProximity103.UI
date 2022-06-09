package dtu


import android.util.Log
import androidx.compose.runtime.toMutableStateList
import com.google.firebase.firestore.FirebaseFirestore
import dtu.core.Constants

class AgegroupRepositoryFirestore: AgegroupRepository {
    var agegroup = mutableListOf<Agegroup>().toMutableStateList()

    override fun getAgegroup() {
        FirebaseFirestore.getInstance().collection(Constants.AGEGROUP)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.w(Constants.FIREBASETAG, "Listen failed.", e)
                    //return@addSnapshotListener
                }

                if (snapshot != null) {
                    Log.d(Constants.FIREBASETAG, "snapshot: $snapshot")
                    agegroup = snapshot.toObjects(Agegroup::class.java).toMutableStateList()
                    Log.d(Constants.FIREBASETAG, "Current data size: ${agegroup.size}")
                    logAgegroup()

                } else {
                    Log.d(Constants.FIREBASETAG, "Current data: null")
                }
            }
    }

    fun logAgegroup(){
        for(age in agegroup) {
            Log.d(Constants.FIREBASETAG, "Age group: ${age}")
        }
    }
}