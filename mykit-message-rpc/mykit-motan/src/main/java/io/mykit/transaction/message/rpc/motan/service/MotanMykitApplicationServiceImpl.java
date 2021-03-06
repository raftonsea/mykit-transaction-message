/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.rpc.motan.service;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import io.mykit.transaction.message.core.service.MykitApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author binghe
 * @version 1.0.0
 * @description MotanMykitApplicationServiceImpl
 */
@Service("rpcApplicationService")
public class MotanMykitApplicationServiceImpl implements MykitApplicationService {

    private final BasicServiceConfigBean basicServiceConfigBean;

    /**
     * Instantiates a new Motan mykit application service.
     *
     * @param basicServiceConfigBean the basic service config bean
     */
    @Autowired
    public MotanMykitApplicationServiceImpl(final BasicServiceConfigBean basicServiceConfigBean) {
        this.basicServiceConfigBean = basicServiceConfigBean;
    }

    @Override
    public String acquireName() {
        return basicServiceConfigBean.getModule();
    }
}
