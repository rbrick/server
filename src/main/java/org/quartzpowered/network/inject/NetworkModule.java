/**
 * This file is a component of Quartz Powered, this license makes sure any work
 * associated with Quartz Powered, must follow the conditions of the license included.
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Quartz Powered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.quartzpowered.network.inject;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import org.quartzpowered.common.inject.CommonModule;
import org.quartzpowered.network.client.NetworkClientFactory;
import org.quartzpowered.network.codec.CodecFactory;
import org.quartzpowered.network.init.NetworkChannelInitializerFactory;
import org.quartzpowered.network.pipeline.HandlerFactory;
import org.quartzpowered.network.session.SessionFactory;

public class NetworkModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new CommonModule());
        install(new FactoryModuleBuilder().build(SessionFactory.class));
        install(new FactoryModuleBuilder().build(CodecFactory.class));
        install(new FactoryModuleBuilder().build(HandlerFactory.class));
        install(new FactoryModuleBuilder().build(NetworkClientFactory.class));
        install(new FactoryModuleBuilder().build(NetworkChannelInitializerFactory.class));
    }
}
