**[中文版说明](https://github.com/AIDC-AI/ali-langengine/blob/main/README_CN.md)**

**ali-langengine**

ali-langengine is a Java-based AI application development framework. It endows LLM with two core capabilities:

1. Data Awareness: Connecting language models with other data sources.

2. Agency Capability: Allowing language models to interact with engineering and systematic capabilities.

The main application scenarios of ali-langengine include personal assistants, document-based Q&A, chatbots, querying tabular data, code analysis, low-code application generation, etc.

**Related Code**

ali-langengine-core: The most essential AI application framework engine module.

ali-langengine-infrastructure: The infrastructure module of the AI application framework.

ali-langengine-community: Community open-source co-construction module.

ali-langengine-demo: Related example module.

**JDK version requirements**

JDK 8+

**Related Configuration**

ali-langengine-openai
```properties
openai_server_url=https://api.openai.com/
openai_api_key=******
openai_api_timeout=100
# compatible
OPENAI_API_KEY=******
```

ali-langengine-dashscope
```properties
# dashscope api
dashscope_server_url=https://dashscope.aliyuncs.com/
dashscope_api_key=******
dashscope_api_timeout=100
# compatible
DASH_SCOPE_API=******
```

ali-langengine-tool
```properties
# bing api
bing_server_url=https://api.bing.microsoft.com/
bing_api_key=******

# google api
google_customsearch_server_url=https://customsearch.googleapis.com/
google_api_key=******
google_cse_id=******

# serpapi api
serpapi_server_url=https://serpapi.com/
serpapi_key=******

# tavily api
tavily_api_key=******
```

ali-langengine-adbpg
```properties
# adbpg db
adbpg_datasource_endpoint=******
adbpg_datasource_databasename=******
adbpg_datasource_u=******
adbpg_datasource_p=******
```

ali-langengine-azure
```properties
# azure api
azure_openai_server_url=******
azure_deployment_name=******
azure_openai_api_version=******
azure_openai_api_timeout=100
```

ali-langengine-claude
```properties
# claude api
anthropic_server_url=https://api.anthropic.com/
anthropic_api_key=******
anthropic_api_timeout=120
```

ali-langengine-gemini
```properties
# gemini api
gemini_api_key=******
gemini_api_timeout=120
```

ali-langengine-hologres
```properties
# hologres db
hologres_datasource_endpoint=******
hologres_datasource_databasename=knowledge_center
hologres_datasource_u=******
hologres_datasource_p=******
```

ali-langengine-huggingface
```properties
# huggingface api
huggingface_api_key=******
```

ali-langengine-milvus
```properties
# milvus
milvus_server_url=******
```

ali-langengine-minimax
```properties
#minimax api
minimax_api_key=******
minimax_group_id=******
minimax_api_timeout=120
```

ali-langengine-moonshot
```properties
# moonshot api
moonshot_server_url=https://api.moonshot.cn
moonshot_api_key=******
moonshot_api_version=v1
moonshot_server_timeout=120
```

ali-langengine-msearch
```properties
#msearch api
msearch_api_key=******
msearch_api_timeout=120
```

ali-langengine-opensearch
```properties
# opensearch vector
opensearch_datasource_instance_id=ha-cn-*****
opensearch_datasource_endpoint=ha-cn-*****
opensearch_datasource_swift_server_root=http://*****
opensearch_datasource_swift_topic=ha-cn-******
```

ali-langengine-pinecone
```properties
# pinecone vector
pinecone_api_key=******
pinecone_environment=us-west4-gcp-free
pinecone_project_name=******
```

ali-langengine-polardb
```properties
# polardb postgres
polardb_datasource_endpoint=******
polardb_datasource_databasename=******
polardb_datasource_u=******
polardb_datasource_p=******
```

ali-langengine-redis
```properties
# redis
redis_host=r-******.redis.rds.aliyuncs.com
redis_port=6379
redis_p=******
redis_session_expire_second=60
```

ali-langengine-tair
```properties
# tair vector
tair_host=r-******.redis.rds.aliyuncs.com
tair_port=6379
tair_p=******
```

ali-langengine-vertexai
```properties
# vertexai
vertexai_server_url=https://us-central1-aiplatform.googleapis.com/
vertexai_api_key=******
vertexai_project_id=******
vertexai_api_timeout=120
```

ali-langengine-xingchen
```properties
# xingchen
xingchen_api_key=lm-******
xingchen_api_timeout=120
```

ali-langengine-xinghuo
```properties
# xinghuo
xinghuo_server_url=https://spark-api.xf-yun.com/v2.1/chat
xinghuo_app_id=******
xinghuo_api_key=******
xinghuo_api_secret=******
```

**License**

This project is licensed under Apache License Version 2 ([https://www.apache.org/licenses/LICENSE-2.0.txt](https://www.apache.org/licenses/LICENSE-2.0.txt), SPDX-License-identifier: Apache-2.0).