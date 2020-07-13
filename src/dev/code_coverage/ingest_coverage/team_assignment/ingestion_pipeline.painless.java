String path=ctx.coveredFilePath;
  if(path.indexOf('src/legacy/core_plugins/kibana/')==0){

  if(path.indexOf('src/legacy/core_plugins/kibana/common/utils')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/migrations')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/dashboard/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/dev_tools/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/discover/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/home')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/home/np_ready/')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/local_application_service/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/kibana/public/management/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/kibana/server/lib')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/core_plugins/kibana/server/lib/management/saved_objects')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/core_plugins/kibana/server/routes/api/management/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/kibana/server/routes/api/import/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/core_plugins/kibana/server/routes/api/export/')==0)ctx.team='kibana-platform';
  else ctx.team='unknown';

  }else if(path.indexOf('src/legacy/core_plugins/')==0){

  if(path.indexOf('src/legacy/core_plugins/apm_oss/')==0)ctx.team='apm-ui';
  else if(path.indexOf('src/legacy/core_plugins/console_legacy')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/elasticsearch')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/core_plugins/embeddable_api/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/input_control_vis')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/interpreter/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/kibana_react/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/newsfeed')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/legacy/core_plugins/region_map')==0)ctx.team='maps';
  else if(path.indexOf('src/legacy/core_plugins/status_page/public')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/core_plugins/testbed')==0)ctx.team='kibana-platform';
// else if (path.indexOf('src/legacy/core_plugins/tests_bundle/') == 0) ctx.team = 'kibana-platform';

  else if(path.indexOf('src/legacy/core_plugins/tile_map')==0)ctx.team='maps';
  else if(path.indexOf('src/legacy/core_plugins/timelion')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/ui_metric/')==0)ctx.team='pulse';
  else if(path.indexOf('src/legacy/core_plugins/vis_type_tagcloud')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/vis_type_vega')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/vis_type_vislib/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/core_plugins/visualizations/')==0)ctx.team='kibana-app-arch';
  else ctx.team='unknown';

  }else if(path.indexOf('src/legacy/server/')==0){

  if(path.indexOf('src/legacy/server/config/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/server/http/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/server/i18n/')==0)ctx.team='kibana-localization';
  else if(path.indexOf('src/legacy/server/index_patterns/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/server/keystore/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/legacy/server/logging/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/server/pid/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/legacy/server/sample_data/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/server/sass/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/legacy/server/saved_objects/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/server/status/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/server/url_shortening/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/server/utils/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/legacy/server/warnings/')==0)ctx.team='kibana-operations';
  else ctx.team='unknown';

  }else if(path.indexOf('src/legacy/ui')==0){

  if(path.indexOf('src/legacy/ui/public/field_editor')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/ui/public/timefilter')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/ui/public/management')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/legacy/ui/public/state_management')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/legacy/ui/public/new_platform')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/plugin_discovery')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/chrome')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/notify')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/documentation_links')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/autoload')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/legacy/ui/public/capabilities')==0)ctx.team='kibana-security';
  else if(path.indexOf('src/legacy/ui/public/apm')==0)ctx.team='apm-ui';

  }else if(path.indexOf('src/plugins/')==0){

  if(path.indexOf('src/plugins/advanced_settings/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/apm_oss/')==0)ctx.team='apm-ui';
  else if(path.indexOf('src/plugins/bfetch/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/charts/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/charts/public/static/color_maps')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/console/')==0)ctx.team='es-ui';
  else if(path.indexOf('src/plugins/dashboard/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/data/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/dev_tools/')==0)ctx.team='es-ui';
  else if(path.indexOf('src/plugins/discover/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/embeddable/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/es_ui_shared/')==0)ctx.team='es-ui';
  else if(path.indexOf('src/plugins/expressions/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/home/public')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/plugins/home/server/tutorials')==0)ctx.team='observability';
  else if(path.indexOf('src/plugins/home/server/services/')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/plugins/home/')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/plugins/index_pattern_management/public/service')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/index_pattern_management/public')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/input_control_vis/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/inspector/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/kibana_legacy/')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/kibana_react/public/code_editor')==0)ctx.team='kibana-canvas';
  else if(path.indexOf('src/plugins/kibana_react/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/kibana_utils/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/management/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/kibana_usage_collection/')==0)ctx.team='pulse';
  else if(path.indexOf('src/plugins/legacy_export/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/plugins/maps_legacy/')==0)ctx.team='maps';
  else if(path.indexOf('src/plugins/region_map/')==0)ctx.team='maps';
  else if(path.indexOf('src/plugins/tile_map/')==0)ctx.team='maps';
  else if(path.indexOf('src/plugins/timelion')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/navigation/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/newsfeed')==0)ctx.team='kibana-core-ui';
  else if(path.indexOf('src/plugins/saved_objects_management/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/plugins/saved_objects/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/share/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/status_page/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/plugins/telemetry')==0)ctx.team='pulse';
  else if(path.indexOf('src/plugins/testbed/server/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/plugins/ui_actions/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/usage_collection/')==0)ctx.team='pulse';
  else if(path.indexOf('src/plugins/vis_default_editor')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/vis_type')==0)ctx.team='kibana-app';
  else if(path.indexOf('src/plugins/visualizations/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('src/plugins/visualize/')==0)ctx.team='kibana-app';
  else ctx.team='unknown';

  }else if(path.indexOf('x-pack/legacy/')==0){

  if(path.indexOf('x-pack/legacy/plugins/actions/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/legacy/plugins/alerting/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/legacy/plugins/apm/')==0)ctx.team='apm-ui';
  else if(path.indexOf('x-pack/legacy/plugins/beats_management/')==0)ctx.team='beats';
  else if(path.indexOf('x-pack/legacy/plugins/canvas/')==0)ctx.team='kibana-canvas';
  else if(path.indexOf('x-pack/legacy/plugins/cross_cluster_replication/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/dashboard_mode/')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/legacy/plugins/encrypted_saved_objects/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/legacy/plugins/index_management/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/infra/')==0)ctx.team='logs-metrics-ui';
  else if(path.indexOf('x-pack/legacy/plugins/ingest_manager/')==0)ctx.team='ingest-management';
  else if(path.indexOf('x-pack/legacy/plugins/license_management/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/maps/')==0)ctx.team='kibana-gis';
  else if(path.indexOf('x-pack/legacy/plugins/ml/')==0)ctx.team='ml-ui';
  else if(path.indexOf('x-pack/legacy/plugins/monitoring/')==0)ctx.team='stack-monitoring-ui';
  else if(path.indexOf('x-pack/legacy/plugins/reporting')==0)ctx.team='kibana-reporting';
  else if(path.indexOf('x-pack/legacy/plugins/rollup/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/security/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/legacy/plugins/siem/')==0)ctx.team='siem';
  else if(path.indexOf('x-pack/legacy/plugins/siem/server/lib/detection_engine/rules/prepackaged_rules')==0)ctx.team='security-intelligence-analytics';
  else if(path.indexOf('x-pack/legacy/plugins/snapshot_restore/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/spaces/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/legacy/plugins/task_manager')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/legacy/plugins/triggers_actions_ui/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/legacy/plugins/upgrade_assistant/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/plugins/uptime')==0)ctx.team='uptime';
  else if(path.indexOf('x-pack/legacy/plugins/xpack_main/server/')==0)ctx.team='kibana-platform';

  else if(path.indexOf('x-pack/legacy/server/lib/create_router/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/server/lib/check_license/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/legacy/server/lib/')==0)ctx.team='kibana-platform';
  else ctx.team='unknown';

  }else if(path.indexOf('x-pack/plugins/')==0){

  if(path.indexOf('x-pack/plugins/actions/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/advanced_ui_actions/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('x-pack/plugins/alerts')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/alerting_builtins')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/apm/')==0)ctx.team='apm-ui';
  else if(path.indexOf('x-pack/plugins/beats_management/')==0)ctx.team='beats';
  else if(path.indexOf('x-pack/plugins/canvas/')==0)ctx.team='kibana-canvas';
  else if(path.indexOf('x-pack/plugins/case')==0)ctx.team='siem';
  else if(path.indexOf('x-pack/plugins/cloud/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('x-pack/plugins/code/')==0)ctx.team='code';
  else if(path.indexOf('x-pack/plugins/console_extensions/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/cross_cluster_replication/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/dashboard_enhanced')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/plugins/dashboard_mode')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/plugins/discover_enhanced')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/plugins/embeddable_enhanced')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('x-pack/plugins/data_enhanced/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('x-pack/plugins/drilldowns/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('x-pack/plugins/encrypted_saved_objects/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/plugins/endpoint/')==0)ctx.team='endpoint-app-team';
  else if(path.indexOf('x-pack/plugins/es_ui_shared/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/event_log/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/features/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('x-pack/plugins/file_upload')==0)ctx.team='kibana-gis';
  else if(path.indexOf('x-pack/plugins/global_search')==0)ctx.team='kibana-platform';

  else if(path.indexOf('x-pack/plugins/graph/')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/plugins/grokdebugger/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/index_lifecycle_management/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/index_management/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/infra/')==0)ctx.team='logs-metrics-ui';
  else if(path.indexOf('x-pack/plugins/ingest_manager/')==0)ctx.team='ingest-management';
  else if(path.indexOf('x-pack/plugins/ingest_pipelines/')==0)ctx.team='es-ui';

  else if(path.indexOf('x-pack/plugins/lens/')==0)ctx.team='kibana-app';
  else if(path.indexOf('x-pack/plugins/license_management/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/licensing/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('x-pack/plugins/lists/')==0)ctx.team='siem';
  else if(path.indexOf('x-pack/plugins/logstash')==0)ctx.team='logstash';
  else if(path.indexOf('x-pack/plugins/maps/')==0)ctx.team='kibana-gis';
  else if(path.indexOf('x-pack/plugins/maps_legacy_licensing')==0)ctx.team='maps';
  else if(path.indexOf('x-pack/plugins/ml/')==0)ctx.team='ml-ui';
  else if(path.indexOf('x-pack/plugins/monitoring')==0)ctx.team='stack-monitoring-ui';
  else if(path.indexOf('x-pack/plugins/observability/')==0)ctx.team='apm-ui';
  else if(path.indexOf('x-pack/plugins/oss_telemetry/')==0)ctx.team='pulse';
  else if(path.indexOf('x-pack/plugins/painless_lab/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/remote_clusters/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/reporting')==0)ctx.team='kibana-reporting';
  else if(path.indexOf('x-pack/plugins/rollup/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/searchprofiler/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/security/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/plugins/security_solution/')==0)ctx.team='siem';

  else if(path.indexOf('x-pack/plugins/siem/server/lib/detection_engine/rules/prepackaged_rules')==0)ctx.team='security-intelligence-analytics';
  else if(path.indexOf('x-pack/plugins/siem/')==0)ctx.team='siem';
  else if(path.indexOf('x-pack/plugins/snapshot_restore/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/spaces/')==0)ctx.team='kibana-security';
  else if(path.indexOf('x-pack/plugins/task_manager/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/telemetry_collection_xpack/')==0)ctx.team='pulse';
  else if(path.indexOf('x-pack/plugins/transform/')==0)ctx.team='ml-ui';
  else if(path.indexOf('x-pack/plugins/translations/')==0)ctx.team='kibana-localization';
  else if(path.indexOf('x-pack/plugins/triggers_actions_ui/')==0)ctx.team='kibana-alerting-services';
  else if(path.indexOf('x-pack/plugins/upgrade_assistant/')==0)ctx.team='es-ui';
  else if(path.indexOf('x-pack/plugins/ui_actions_enhanced')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('x-pack/plugins/uptime')==0)ctx.team='uptime';

  else if(path.indexOf('x-pack/plugins/watcher/')==0)ctx.team='es-ui';
  else ctx.team='unknown';

  }else if(path.indexOf('packages')==0){

  if(path.indexOf('packages/kbn-analytics/')==0)ctx.team='pulse';
  else if(path.indexOf('packages/kbn-babel')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-config-schema/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('packages/elastic-datemath')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('packages/kbn-dev-utils')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-es/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-eslint')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-expect')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-i18n/')==0)ctx.team='kibana-localization';
  else if(path.indexOf('packages/kbn-interpreter/')==0)ctx.team='kibana-app-arch';
  else if(path.indexOf('packages/kbn-optimizer/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-pm/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-test/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-test-subj-selector/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('packages/kbn-ui-framework/')==0)ctx.team='kibana-design';
  else if(path.indexOf('packages/kbn-ui-shared-deps/')==0)ctx.team='kibana-operations';
  else ctx.team='unknown';

  }else{

  if(path.indexOf('config/kibana.yml')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/apm.js')==0)ctx.team='apm-ui';
  else if(path.indexOf('src/core/')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/core/public/i18n/')==0)ctx.team='kibana-localization';
  else if(path.indexOf('src/core/server/csp/')==0)ctx.team='kibana-security';
  else if(path.indexOf('src/dev/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/dev/i18n/')==0)ctx.team='kibana-localization';
  else if(path.indexOf('src/dev/run_check_published_api_changes.ts')==0)ctx.team='kibana-platform';
  else if(path.indexOf('src/es_archiver/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/optimize/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/setup_node_env/')==0)ctx.team='kibana-operations';
  else if(path.indexOf('src/test_utils/')==0)ctx.team='kibana-operations';
  else ctx.team='unknown';
