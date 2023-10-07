package com.example.artspace

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import android.content.res.Resources
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.draw.shadow


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {

    var result by remember { mutableStateOf( 1) }
    val artworksImages = when(result) {
        1 -> R.drawable.data1
        2 -> R.drawable.data2
        3 -> R.drawable.data3
        5 -> R.drawable.data4
        4 -> R.drawable.data5
        6 -> R.drawable.data6
        7 -> R.drawable.data7
        8 -> R.drawable.data8
        9 -> R.drawable.data9
        else -> R.drawable.data10
    }

    val artwork_names = when(result){
        1 -> R.string.data1_name
        2 -> R.string.data2_name
        3 -> R.string.data3_name
        4 -> R.string.data4_name
        5 -> R.string.data5_name
        6 -> R.string.data6_name
        7 -> R.string.data7_name
        8 -> R.string.data8_name
        9 -> R.string.data9_name
        else -> R.string.data10_name
    }

    val artwork_years = when(result){
        1 -> R.string.data1_year
        2 -> R.string.data2_year
        3 -> R.string.data3_year
        4 -> R.string.data4_year
        5 -> R.string.data5_year
        6 -> R.string.data6_year
        7 -> R.string.data7_year
        8 -> R.string.data8_year
        9 -> R.string.data9_year
        else -> R.string.data10_year
    }


    val artwork_descriptions = when(result){
        1 -> R.string.data1_msg
        2 -> R.string.data2_msg
        3 -> R.string.data3_msg
        4 -> R.string.data4_msg
        5 -> R.string.data5_msg
        6 -> R.string.data6_msg
        7 -> R.string.data7_msg
        8 -> R.string.data8_msg
        9 -> R.string.data9_msg
        else -> R.string.data10_msg
    }

    var currentArtwork by remember { mutableStateOf(artworksImages) }


    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = "Jhon FReddy Popo Moreno",
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.purple_700),
            fontSize = 22.sp,
            modifier = Modifier
        )

        Text(
            text = "202010003 - 3743",
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.purple_500),
            fontSize = 16.sp,
            modifier = Modifier
        )

        ArtworkImage(
            currentArtwork = artworksImages
        )

        Spacer(
            modifier = modifier.size(16.dp)
        )

        ArtworkTitle(
            title = artwork_names,
            year = artwork_years,
            description = artwork_descriptions,
        )

        Spacer(
            modifier = modifier.size(25.dp)
        )
        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Button(
                onClick = {
                    if (result > 1){
                        result -= 1
                    }

                    /*when (currentArtwork) {
                        data1 -> {
                            currentArtwork = data2
                            title = R.string.data2_name
                            year = R.string.data2_year
                            description = R.string.data2_msg
                        }
                        data2 -> {
                            currentArtwork = data3
                            title = R.string.data3_name
                            year = R.string.data3_year
                            description = R.string.data3_msg
                        }
                        data3 -> {
                            currentArtwork = data4
                            title = R.string.data4_name
                            description = R.string.data4_msg
                        }
                        data4 -> {
                            currentArtwork = data5
                            title = R.string.data5_name
                            description = R.string.data5_msg
                        }
                        data5 -> {
                            currentArtwork = data6
                            title = R.string.data6_name
                            year = R.string.data6_year
                            description = R.string.data6_msg
                        }
                        data6 -> {
                            currentArtwork = data7
                            title = R.string.data7_name
                            description = R.string.data7_msg
                        }
                        data7 -> {
                            currentArtwork = data8
                            title = R.string.data8_name
                            year = R.string.data8_year
                            description = R.string.data8_msg
                        }

                        else -> {
                            currentArtwork = data1
                            title = R.string.data1_name
                            year = R.string.data1_year
                            description = R.string.data1_msg
                        }
                    }*/
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.teal_700),
                    containerColor = colorResource(id = R.color.teal_700)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp,
                )
            ) {
                Text(
                    text = stringResource(R.string.previuos),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white)
                )
            }
            Button(
                onClick = {
                    /*currentArtwork = data1
                    title = R.string.data1_name
                    year = R.string.data1_year
                    description = R.string.data1_msg*/
                    result = 1
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.teal_700),
                    containerColor = colorResource(id = R.color.teal_700)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp,
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }
            Button(
                onClick = {
                    /*when (currentArtwork) {

                        data1 -> {
                            currentArtwork = data8
                            title = R.string.data8_name
                            year = R.string.data8_year
                            description = R.string.data8_msg
                        }
                        data2 -> {
                            currentArtwork = data7
                            title = R.string.data7_name
                            year = R.string.data7_year
                            description = R.string.data7_msg
                        }
                        data3 -> {
                            currentArtwork = data6
                            title = R.string.data6_name
                            year = R.string.data6_year
                            description = R.string.data6_msg
                        }
                        data4 -> {
                            currentArtwork = data5
                            title = R.string.data5_name
                            year = R.string.data5_year
                            description = R.string.data5_msg
                        }
                        data5 -> {
                            currentArtwork = data4
                            title = R.string.data4_name
                            year = R.string.data4_year
                            description = R.string.data4_msg
                        }
                        data6 -> {
                            currentArtwork = data3
                            title = R.string.data3_name
                            year = R.string.data3_year
                            description = R.string.data3_msg
                        }
                        data7 -> {
                            currentArtwork = data2
                            title = R.string.data2_name
                            year = R.string.data2_year
                            description = R.string.data2_msg
                        }
                        else -> {
                            currentArtwork = data1
                            title = R.string.data1_name
                            year = R.string.data1_year
                            description = R.string.data1_msg
                        }
                    }*/
                    if( result <= 9) {
                        result += 1
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.teal_700),
                    containerColor = colorResource(id = R.color.teal_700)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                ),
            ) {
                Text(
                    text = stringResource(R.string.next),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white)
                )
            }
        }
    }
}

@Composable
fun ArtworkImage(
    modifier: Modifier = Modifier,
    @DrawableRes currentArtwork: Int
) {
    Surface(
        modifier = modifier.fillMaxWidth().padding(10.dp).shadow(30.dp),
        color = colorResource(id = R.color.gray_900),
        shape = MaterialTheme.shapes.medium, // Opcional: ajusta la forma del Surface
    ){
        Image(
            painter = painterResource(id = currentArtwork),
            contentDescription = null,
            modifier = modifier.aspectRatio(1f),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun ArtworkTitle(
    @StringRes title: Int,
    @StringRes year: Int,
    @StringRes description: Int,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.teal_700),
            fontSize = 32.sp,
        )
        Text(
            text = stringResource(id = year),
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.gray_300),
            fontSize = 16.sp,
        )
        Text(
            text = stringResource(id = description),
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.gray_300),
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}



