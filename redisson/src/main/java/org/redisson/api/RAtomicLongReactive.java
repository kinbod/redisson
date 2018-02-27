/**
 * Copyright 2018 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.api;

import org.reactivestreams.Publisher;

/**
 * 
 * @author Nikita Koksharov
 *
 */
public interface RAtomicLongReactive extends RExpirableReactive {

    Publisher<Boolean> compareAndSet(long expect, long update);

    Publisher<Long> addAndGet(long delta);

    Publisher<Long> decrementAndGet();

    Publisher<Long> get();

    Publisher<Long> getAndAdd(long delta);

    Publisher<Long> getAndSet(long newValue);

    Publisher<Long> incrementAndGet();

    Publisher<Long> getAndIncrement();

    Publisher<Long> getAndDecrement();

    Publisher<Void> set(long newValue);

}
