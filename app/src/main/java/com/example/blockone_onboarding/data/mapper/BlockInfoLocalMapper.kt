package com.example.blockone_onboarding.data.mapper

import com.example.blockone_onboarding.data.model.local.BlockInfoLocal
import com.example.blockone_onboarding.domain.model.BlockInfo
import javax.inject.Inject

class BlockInfoLocalMapper @Inject constructor() : BaseMapper<BlockInfoLocal, BlockInfo> {

    override fun transform(input: BlockInfoLocal): BlockInfo {
        return BlockInfo(
            headBlockNum = input.headBlockNum,
            forkDbHeadBlockNum = input.forkDbHeadBlockNum,
            chainId = input.chainId,
            headBlockTime = input.headBlockTime,
            virtualBlockNetLimit = input.virtualBlockNetLimit,
            virtualBlockCpuLimit = input.virtualBlockCpuLimit,
            lastIrreversibleBlockNum = input.lastIrreversibleBlockNum,
            serverVersion = input.serverVersion,
            blockCpuLimit = input.blockCpuLimit,
            headBlockProducer = input.headBlockProducer,
            forkDbHeadBlockId = input.forkDbHeadBlockId,
            lastIrreversibleBlockId = input.lastIrreversibleBlockId,
            blockNetLimit = input.blockNetLimit,
            headBlockId = input.headBlockId,
            serverFullVersionString = input.serverFullVersionString,
            serverVersionString = input.serverVersionString
        )
    }

    override fun transformToEntity(input: BlockInfo): BlockInfoLocal {
        return BlockInfoLocal(
            headBlockNum = input.headBlockNum,
            forkDbHeadBlockNum = input.forkDbHeadBlockNum,
            chainId = input.chainId,
            headBlockTime = input.headBlockTime,
            virtualBlockNetLimit = input.virtualBlockNetLimit,
            virtualBlockCpuLimit = input.virtualBlockCpuLimit,
            lastIrreversibleBlockNum = input.lastIrreversibleBlockNum,
            serverVersion = input.serverVersion,
            blockCpuLimit = input.blockCpuLimit,
            headBlockProducer = input.headBlockProducer,
            forkDbHeadBlockId = input.forkDbHeadBlockId,
            lastIrreversibleBlockId = input.lastIrreversibleBlockId,
            blockNetLimit = input.blockNetLimit,
            headBlockId = input.headBlockId,
            serverFullVersionString = input.serverFullVersionString,
            serverVersionString = input.serverVersionString
        )
    }
}