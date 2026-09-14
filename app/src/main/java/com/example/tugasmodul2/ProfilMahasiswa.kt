package com.example.tugasmodul2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilMahasiswa() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(contentAlignment = Alignment.TopEnd) {

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "👤", fontSize = androidx.compose.ui.unit.TextUnit.Unspecified)
            }
            Text(text = "✏️", fontSize = androidx.compose.ui.unit.TextUnit.Unspecified)
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "Nama: Salsabila Zalyyatul Ummah",
                fontWeight = FontWeight.Bold
            )
            Text(text = "NIM: 245150607111003")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfilMahasiswa() {
    ProfilMahasiswa()
}