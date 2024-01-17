(ns frontend.worker.rtc.asset-sync-effects-test
  "This ns include tests abouts asset-sync with other components.
  These tests need to start the asset-sync-loop."
  (:require [cljs.core.async :as async :refer [<! >! go timeout]]
            [clojure.test :as t :refer [deftest is use-fixtures]]
            [frontend.test.helper :include-macros true :as test-helper]
            [frontend.worker.rtc.fixture :as rtc-fixture]))

(use-fixtures :each
  test-helper/start-and-destroy-db-map-fixture
  rtc-fixture/listen-test-db-fixture
  rtc-fixture/start-and-stop-asset-sync-loop-fixture
  rtc-fixture/clear-op-mem-stores-fixture)
