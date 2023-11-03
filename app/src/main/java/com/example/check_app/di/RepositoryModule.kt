package com.example.check_app.di

import com.example.data.repository.MainRepositoryImpl
import com.example.data.repository.remote.datasource.MainDataSource
import com.example.domain.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideMainRepository(
        mainDataSource: MainDataSource
    ): MainRepository {
        return MainRepositoryImpl(
            mainDataSource
        )
    }
}