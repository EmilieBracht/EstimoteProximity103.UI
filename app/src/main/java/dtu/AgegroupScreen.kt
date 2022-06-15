package dtu

import androidx.compose.runtime.Composable

@Composable
fun AgegroupScreen (
    agegroupViewModel: AgegroupViewModel
) {
    AgegroupList(
        list = agegroupViewModel.agegroupRepository.agegroup
    )
}