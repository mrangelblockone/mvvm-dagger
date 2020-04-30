package com.example.blockone_onboarding.data.model.remote

import com.google.gson.annotations.SerializedName

data class BlockRemote(

    @field:SerializedName("ref_block_prefix")
	val refBlockPrefix: Long? = null,

    @field:SerializedName("new_producers")
	val newProducers: Any? = null,

    @field:SerializedName("previous")
	val previous: String? = null,

    @field:SerializedName("schedule_version")
	val scheduleVersion: Int? = null,

    @field:SerializedName("producer_signature")
	val producerSignature: String? = null,

    @field:SerializedName("transactions")
	val transactions: List<TransactionsItem?>? = null,

    @field:SerializedName("confirmed")
	val confirmed: Int? = null,

    @field:SerializedName("block_num")
	val blockNum: Int? = null,

    @field:SerializedName("producer")
	val producer: String? = null,

    @field:SerializedName("transaction_mroot")
	val transactionMroot: String? = null,

    @field:SerializedName("id")
	val id: String? = null,

    @field:SerializedName("action_mroot")
	val actionMroot: String? = null,

    @field:SerializedName("timestamp")
	val timestamp: String? = null
)

data class TransactionsItem(

    @field:SerializedName("net_usage_words")
	val netUsageWords: Int? = null,

    @field:SerializedName("trx")
	val trx: Trx? = null,

    @field:SerializedName("cpu_usage_us")
	val cpuUsageUs: Int? = null,

    @field:SerializedName("status")
	val status: String? = null
)

data class Trx(

    @field:SerializedName("packed_trx")
	val packedTrx: String? = null,

    @field:SerializedName("packed_context_free_data")
	val packedContextFreeData: String? = null,

    @field:SerializedName("id")
	val id: String? = null,

    @field:SerializedName("compression")
	val compression: String? = null,

    @field:SerializedName("signatures")
	val signatures: List<String?>? = null,

    @field:SerializedName("transaction")
	val transaction: Transaction? = null,

    @field:SerializedName("context_free_data")
	val contextFreeData: List<Any?>? = null
)

data class Transaction(

	@field:SerializedName("ref_block_prefix")
	val refBlockPrefix: Long? = null,

	@field:SerializedName("max_cpu_usage_ms")
	val maxCpuUsageMs: Int? = null,

	@field:SerializedName("expiration")
	val expiration: String? = null,

	@field:SerializedName("max_net_usage_words")
	val maxNetUsageWords: Int? = null,

	@field:SerializedName("delay_sec")
	val delaySec: Int? = null,

	@field:SerializedName("ref_block_num")
	val refBlockNum: Int? = null,

	@field:SerializedName("actions")
	val actions: List<ActionsItem?>? = null
)

data class ActionsItem(

    @field:SerializedName("authorization")
	val authorization: List<AuthorizationItem?>? = null,

    @field:SerializedName("data")
	val data: String? = null,

    @field:SerializedName("name")
	val name: String? = null,

    @field:SerializedName("account")
	val account: String? = null
)

data class AuthorizationItem(

	@field:SerializedName("actor")
	val actor: String? = null,

	@field:SerializedName("permission")
	val permission: String? = null
)
