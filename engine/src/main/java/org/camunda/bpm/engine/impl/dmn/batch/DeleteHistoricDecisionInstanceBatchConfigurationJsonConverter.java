/*
 * Copyright © 2013-2019 camunda services GmbH and various authors (info@camunda.com)
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
package org.camunda.bpm.engine.impl.dmn.batch;

import java.util.List;

import org.camunda.bpm.engine.impl.batch.BatchConfiguration;
import org.camunda.bpm.engine.impl.json.JsonObjectConverter;
import org.camunda.bpm.engine.impl.util.JsonUtil;
import com.google.gson.JsonObject;

public class DeleteHistoricDecisionInstanceBatchConfigurationJsonConverter extends JsonObjectConverter<BatchConfiguration> {

  public static final DeleteHistoricDecisionInstanceBatchConfigurationJsonConverter INSTANCE = new DeleteHistoricDecisionInstanceBatchConfigurationJsonConverter();

  public static final String HISTORIC_DECISION_INSTANCE_IDS = "historicDecisionInstanceIds";

  public JsonObject toJsonObject(BatchConfiguration configuration) {
    JsonObject json = JsonUtil.createObject();
    JsonUtil.addListField(json, HISTORIC_DECISION_INSTANCE_IDS, configuration.getIds());
    return json;
  }

  public BatchConfiguration toObject(JsonObject json) {
    BatchConfiguration configuration = new BatchConfiguration(readDecisionInstanceIds(json));
    return configuration;
  }

  protected List<String> readDecisionInstanceIds(JsonObject jsonNode) {
    return JsonUtil.asStringList(JsonUtil.getArray(jsonNode, HISTORIC_DECISION_INSTANCE_IDS));
  }

}
