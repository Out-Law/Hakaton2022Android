package com.example.hakathon2022.ui.screens

import android.content.ContentValues
import android.graphics.Bitmap
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.hakathon2022.models.Student
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException

@Composable
fun QRStudentScreen(navController: NavController){
    var student = Student()
    student.group = "КТбо4-1"
    student.name = "Никита"
    student.surname = "Сафронов"
    AsyncImage(

        generateQRCode(student),
        contentDescription = "123",
        alignment = Alignment.Center
    )
}

@Composable
private fun generateQRCode(student: Student): Bitmap {
    val width = 1000
    val height = 1000
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
        Log.d(ContentValues.TAG, "generateQRCode: ${e.message}")
    }
    return bitmap
}