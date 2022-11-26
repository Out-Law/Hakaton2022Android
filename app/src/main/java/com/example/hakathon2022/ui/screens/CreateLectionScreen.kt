package com.example.hakathon2022.ui.screens

import android.content.ContentValues.TAG
import android.graphics.Bitmap
import android.graphics.ColorSpace
import android.util.Log
import android.widget.EditText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.semantics.SemanticsProperties.EditableText
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.hakathon2022.UsersService
import com.example.hakathon2022.models.Student
import com.example.hakathon2022.ui.common.CommonText
import com.google.android.gms.common.internal.service.Common
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter

@Composable
fun createLectionScreen() {
    var student = UsersService().student
    var group = remember { mutableStateOf("")}
    var subject = remember { mutableStateOf("")}
    var time = remember { mutableStateOf("")}
    val state = remember {mutableStateOf(true)}
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
        .padding(vertical = 20.dp, horizontal = 10.dp)) {
        Row (verticalAlignment = Alignment.CenterVertically){
            CommonText(text = "Время занятия: ")
            OutlinedTextField(value = time.value, placeholder = { CommonText(text = "Время", color = Color.Gray)}, shape = RoundedCornerShape(15.dp),
                onValueChange = { newText ->
                time.value = newText
            })
        }
        Column(modifier = Modifier
            .selectableGroup()
            .fillMaxWidth(), horizontalAlignment = Alignment.Start) {
            Row (verticalAlignment = Alignment.CenterVertically){
                RadioButton(
                    selected = state.value,
                    onClick = { state.value = true },
                    modifier = Modifier.padding(8.dp)
                )
                CommonText(text = "Онлайн")
            }
            Row (verticalAlignment = Alignment.CenterVertically){
                RadioButton(
                    selected = !state.value,
                    onClick = { state.value = false },
                    modifier = Modifier.padding(8.dp)
                )
                CommonText(text = "Оффлайн")
            }
        }
        Row (verticalAlignment = Alignment.CenterVertically){
            CommonText(text = "Группа: ")
            OutlinedTextField(value = group.value, placeholder = { CommonText(text = "Группа, у котрой идёт занятие", color = Color.Gray)}, shape = RoundedCornerShape(15.dp),
                onValueChange = { newText ->
                group.value = newText
                //group = it
            })
        }
        Row (verticalAlignment = Alignment.CenterVertically){
            CommonText(text = "Предмет: ")
            OutlinedTextField(value = subject.value, placeholder = { CommonText(text = "По какому предмету занятие", color = Color.Gray)}, shape = RoundedCornerShape(15.dp),
                onValueChange = { newText ->
                subject.value = newText
                //group = it
            })
        }
        Button(modifier = Modifier.padding(bottom = 64.dp),
            onClick = {}, content = {
            CommonText(text = "Создать лекцию", color = Color.White)
        })
        AsyncImage(
            generateQRCode(student),
            contentDescription = "123"
        )
    }
}

@Composable
private fun generateQRCode(student: Student): Bitmap {
    val width = 500
    val height = 500
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val codeWriter = MultiFormatWriter()
    try {
        val bitMatrix = codeWriter.encode("${student.group}/${student.surname}/${student.name}", BarcodeFormat.QR_CODE, width, height)
        for (x in 0 until width) {
            for (y in 0 until height) {
                bitmap.setPixel(x, y, if (bitMatrix[x, y]) Color.Black.toArgb() else Color.White.toArgb())
            }
        }
    } catch (e: WriterException) {
        Log.d(TAG, "generateQRCode: ${e.message}")
    }
    return bitmap
}

