import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import com.jemutai.retrofit_jetpack.MyViewModel

@Composable
fun WizardData(modifier: Modifier = Modifier, viewModel: MyViewModel) {
    val data = viewModel.hse.observeAsState().value

    if (data != null) {
        Text(text = data,
            modifier = modifier.padding(18.dp))
    }
    else {
        Text(text = "Loading...", modifier = modifier.padding(18.dp))
    }
}
