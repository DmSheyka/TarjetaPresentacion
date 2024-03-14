package edu.daletb.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.daletb.tarjetapresentacion.ui.theme.TarjetaDePresentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentaciónTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}


@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = colorResource(id = R.color.yellow_200)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val img = painterResource(id = R.drawable.android_logo)
        Image(
            painter = img, contentDescription = null, modifier = Modifier
                .background(color = colorResource(id = R.color.blue_gray_900))
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = stringResource(R.string.texto_nombre),
        )
        Text(
            text = stringResource(R.string.texto_ocupacion),
            color = colorResource(id = R.color.orange_800)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
        ){
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                tint = Color(0xFFEF6C00)
            )
            Text(
                text = stringResource(R.string.texto_numero_telefonico),
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
            ){
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                tint = Color(0xFFEF6C00)
            )
            Text(
                text = stringResource(R.string.texto_nombre_usuario),
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
            ){
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color(0xFFEF6C00)
            )
            Text(
                text = stringResource(R.string.texto_correo_electronico),
                modifier = Modifier.padding(start = 25.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaTarjeta() {
    TarjetaDePresentaciónTheme {
        TarjetaPresentacion()
    }
}