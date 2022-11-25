package com.example.hakathon2022.ui.screens

import android.content.Context
import android.app.Activity.RESULT_OK
import android.app.TaskStackBuilder.create
import android.content.IntentSender
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.platform.LocalContext
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.tasks.Task
import android.location.LocationRequest
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.core.os.LocaleListCompat.create
import com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY
import com.google.android.gms.location.LocationSettingsRequest

@Composable
fun Start(fusedLocationProviderClient: FusedLocationProviderClient){

    Scaffold(
        content = {

        }
    )
}