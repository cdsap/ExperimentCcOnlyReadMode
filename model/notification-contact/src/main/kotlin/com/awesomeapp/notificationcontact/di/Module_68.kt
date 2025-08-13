package com.awesomeapp.notificationcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcontact.Viewmodel68_1
import com.awesomeapp.notificationcontact.Activity68_2
import com.awesomeapp.notificationcontact.Activity68_3
import com.awesomeapp.notificationcontact.Fragment68_4
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.notificationcontact.Api68_6

@Module
@InstallIn(SingletonComponent::class)
object Module_68 {
    @Provides
    @Singleton
    fun provideRepository68_5(
        api0: Api52_6 = Api52_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api44_6 = Api44_6()
    ): Repository68_5 {
        return Repository68_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi68_6(): Api68_6 {
        return Api68_6()
    }
}