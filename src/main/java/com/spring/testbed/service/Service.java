/*
 * Copyright 2020 Tommy Hamblin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spring.testbed.service;

import com.spring.testbed.model.DataObject;
import com.spring.testbed.repository.IRepository;
import com.spring.testbed.repository.Repository;

import java.util.List;

public class Service implements IService
{
    /** Instance of {@link IRepository}. */
    private IRepository repository = new Repository();

    /**
     * Default constructor.
     */
    public Service()
    {
        super();
    }

    /**
     * {@inheritDoc}
     *
     * @return List - the data objects.
     */
    @Override
    public List<DataObject> retrieveData()
    {
        return repository.getAll();
    }
}