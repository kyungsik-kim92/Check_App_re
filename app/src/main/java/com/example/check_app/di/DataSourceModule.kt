package com.example.check_app.di

import com.example.data.remote.api.LoveCalculatorApi
import com.example.data.repository.remote.datasource.MainDataSource
import com.example.data.repository.remote.datasourceimpl.MainDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideMainDataSource(
        loveCalculatorApi: LoveCalculatorApi,
//        firebaseRtdb: FirebaseDatabase,
//        fireStore: FirebaseFirestore
    ): MainDataSource {
        return MainDataSourceImpl(
            loveCalculatorApi,
//            firebaseRtdb, fireStore
        )
    }
}