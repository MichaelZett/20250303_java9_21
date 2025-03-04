package de.zettsystems.java16_17.solution16_17;

// TODO we have all the strategies needed - make sure no one creates new strategies
public sealed interface QueueStrategy permits FifoQueueStrategyImpl, LifoQueueStrategyImpl {
    void execute();
}
