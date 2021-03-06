/*
 * Copyright © 2013-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.runtime;

import java.util.List;
import org.camunda.bpm.engine.history.HistoricProcessInstanceQuery;

public interface UpdateProcessInstancesRequest {

  /**
   * Selects a list of process instances with the given list of ids.
   *
   * @param processInstanceIds
   *          list of ids of the process instances
   * @return the builder
   */
  UpdateProcessInstancesSuspensionStateBuilder byProcessInstanceIds(List<String> processInstanceIds);

  /**
   * Selects a list of process instances with the given list of ids.
   *
   * @param processInstanceIds
   *          list of ids of the process instances
   * @return the builder
   */
  UpdateProcessInstancesSuspensionStateBuilder byProcessInstanceIds(String... processInstanceIds);

  /**
   * Selects a list of process instances with the given a process instance query.
   *
   * @param processInstanceQuery
   *          process instance query that discribes a list of the process instances
   * @return the builder
   */
  UpdateProcessInstancesSuspensionStateBuilder byProcessInstanceQuery(ProcessInstanceQuery processInstanceQuery);

  /**
   * Selects a list of process instances with the given a historical process instance query.
   *
   * @param historicProcessInstanceQuery
   *          historical process instance query that discribes a list of the process instances
   * @return the builder
   */
  UpdateProcessInstancesSuspensionStateBuilder byHistoricProcessInstanceQuery(HistoricProcessInstanceQuery historicProcessInstanceQuery);

}
