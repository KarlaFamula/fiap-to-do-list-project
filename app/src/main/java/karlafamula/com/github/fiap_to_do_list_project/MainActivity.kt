package karlafamula.com.github.fiap_to_do_list_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import karlafamula.com.github.fiap_to_do_list_project.navigation.AppNavigation
import karlafamula.com.github.fiap_to_do_list_project.ui.theme.FiaptodolistprojectTheme
import karlafamula.com.github.fiap_to_do_list_project.viewmodel.TarefaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FiaptodolistprojectTheme {
                val viewModel: TarefaViewModel = viewModel(
                    factory = TarefaViewModel.factory(applicationContext)
                )
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}
