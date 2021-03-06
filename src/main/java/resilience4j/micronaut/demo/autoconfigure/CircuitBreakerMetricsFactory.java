/*
 * Copyright 2017 Robert Winkler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package resilience4j.micronaut.demo.autoconfigure;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.micrometer.tagged.TaggedCircuitBreakerMetrics;
import io.micronaut.context.annotation.Factory;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Factory for resilience4j-micrometer.
 */
@Factory
public class CircuitBreakerMetricsFactory {

    @Inject
    private CircuitBreakerRegistry circuitBreakerRegistry;

    @Singleton
    public TaggedCircuitBreakerMetrics registerCircuitBreakerMetrics() {
        return TaggedCircuitBreakerMetrics.ofCircuitBreakerRegistry(circuitBreakerRegistry);
    }
}
