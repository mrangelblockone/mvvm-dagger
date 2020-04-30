package com.example.blockone_onboarding.data.mapper


interface BaseMapper<T, F> {
    fun transform(input: T): F
    fun transformToEntity(input: F): T
}

interface BaseRemoteMapper<T, F> {
    fun transform(input: T): F
}