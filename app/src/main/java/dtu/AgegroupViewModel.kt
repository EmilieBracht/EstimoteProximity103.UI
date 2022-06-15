package dtu

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class AgegroupViewModel : ViewModel() {
        //var staffRepository = StaffRepositoryMock()
        var agegroupRepository = AgegroupRepositoryFirestore()

        private var _agegroup = agegroupRepository.agegroup.toMutableStateList()
        val agegroup: List<Agegroup>
            get() = _agegroup

        //init {
          //  agegroupRepository.getAgegroup()
       // }

        fun getAgegroup(ageID: String){
            agegroupRepository.getAgegroup(ageID)
            //agegroupRepository.agegroup.add(Agegroup("30"))
        }

    }
