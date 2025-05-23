/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.load.command

import io.micronaut.context.annotation.Primary
import io.micronaut.context.annotation.Requires
import jakarta.inject.Singleton

@Singleton
@Primary
@Requires(env = ["MockDestinationConfiguration"])
class MockDestinationConfiguration : DestinationConfiguration() {
    override val recordBatchSizeBytes: Long = 1024L

    override val maxMessageQueueMemoryUsageRatio: Double = 0.1
    override val estimatedRecordMemoryOverheadRatio: Double = 1.1
}
