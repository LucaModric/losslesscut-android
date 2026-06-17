package com.tazztone.losslesscut.di

import com.tazztone.losslesscut.domain.engine.ILosslessEngine
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface TestEngineEntryPoint {
    fun getLosslessEngine(): ILosslessEngine
}
